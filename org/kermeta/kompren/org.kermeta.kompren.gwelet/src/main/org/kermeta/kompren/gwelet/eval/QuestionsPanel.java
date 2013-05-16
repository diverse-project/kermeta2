package org.kermeta.kompren.gwelet.eval;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.kermeta.kompren.gwelet.actions.ReinitView;
import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.malai.swing.widget.MToolBar;

public class QuestionsPanel extends JPanel {
	public static final TypeEval TYPE_EVAL = TypeEval.WITH_VISU_TOOLS;

	public enum TypeEval {
		WITH_VISU_TOOLS,
		WITHOUT_VISU_TOOLS
	}
	
	public enum QuestionList {
		Q1 {
			@Override public String getTitle() { return "<html><font size=\"10\">What are the super classes of the class <b>Type</b>?</font></html>"; }
			@Override public String getHelper() { return "Give the name of the classes:"; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
		},
		Q2 {
			@Override public String getTitle() { return "<html><font size=\"10\">What is the role </font><font size=\"5\">(i.e. the name)</font><font size=\"10\"> of the relation that links the class <b>State</b> to the class <b>Comment</b>?</font></html>"; }
			@Override public String getHelper() { return "Give the name of the role:"; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
		},
		Q3 {
			@Override public String getTitle() { return "<html><font size=\"10\">What are the classes <b>directly</b> linked </font><font size=\"5\">(by inheritance, composition, and association)</font><font size=\"10\"> to the class <b>Class?</b></font></html>"; }
			@Override public String getHelper() { return "Give the name of the classes:"; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
		},
		Q4 {
			@Override public String getTitle() { return "<html><font size=\"10\">What are the name of the, native and inherited, relations and attributes of the class <b>Abstraction</b>?</font></html>"; }
			@Override public String getHelper() { return "Enumerate the names:"; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
		};
		
		public abstract String getTitle();
		public abstract Metamodel getMetamodel();
		public abstract String getHelper();
		public static QuestionList getQuestion(String q) {
			QuestionList[] val = values();
			for(int i=0; i<val.length; i++)
				if(val[i].name().equals(q))
					return val[i];
			return null;
		}
	}
	
	public enum Metamodel {
		UML,
		KERMETA
	}

	private static final long serialVersionUID = 1L;

	protected EditorPaneAntiAlias questionArea;

	protected EditorPaneAntiAlias answerArea;

	protected int currentNbQuestions;

	protected JLabel questionLabel;

	protected JLabel answerLabel;

	protected JLabel helperLabel;

	protected MToolBar toolbar;

	protected JButton startButton;

	protected JButton answerButton;

	protected EditorPaneAntiAlias resultField;

	protected EditorPaneAntiAlias resultLabel;

	protected List<Question> questions;

	protected long currentTime;

	protected Sniffer sniffer;

	protected String userInformations;

	protected GweletFrame frame;

	protected Formular formular;
	

	public QuestionsPanel(final GweletFrame frame, final MToolBar toolbar) {
		super();

		this.frame 		= frame;
		this.toolbar	= toolbar;
		userInformations= "";
		sniffer 		= new Sniffer(frame);
		questions 		= new ArrayList<>();
		currentNbQuestions = -1;

		resultLabel = new EditorPaneAntiAlias(true);
		resultLabel.setEditable(false);
		resultLabel.setAlignmentX(CENTER_ALIGNMENT);
		resultLabel.setMaximumSize(new Dimension(500, 80));

		resultField = new EditorPaneAntiAlias(false);
		resultField.setEditable(false);
		resultField.setBackground(Color.WHITE);

		startButton = new JButton("<html><font size=\"+2\"><b>Start</b></font></html>");
		startButton.setAlignmentX(CENTER_ALIGNMENT);
		startButton.addActionListener(new ShowAnswerFieldListener());
		startButton.setMaximumSize(new Dimension(120, 50));

		answerButton = new JButton("<html><font size=\"+2\"><b>Validate Answer</b></font></html>");
		answerButton.setAlignmentX(CENTER_ALIGNMENT);
		answerButton.addActionListener(new ShowQuestionFieldListener());
		answerButton.setMaximumSize(new Dimension(230, 50));
		questionLabel = new JLabel();
		questionLabel.setAlignmentX(CENTER_ALIGNMENT);
		questionLabel.setMaximumSize(new Dimension(120, 40));
		answerLabel = new JLabel();
		answerLabel.setText("<html><font size=\"+1\"><b>Answer</b></font></html>");
		answerLabel.setAlignmentX(CENTER_ALIGNMENT);
		answerLabel.setMaximumSize(new Dimension(120, 40));

		answerArea = new EditorPaneAntiAlias(false);
        answerArea.setPreferredSize(new Dimension(380, 250));
		answerArea.setMaximumSize(new Dimension(380, 250));
		answerArea.setAlignmentX(CENTER_ALIGNMENT);
		answerArea.setBackground(Color.WHITE);

		JPanel panel = new JPanel();
		helperLabel = new JLabel();
		helperLabel.setAlignmentX(LEFT_ALIGNMENT);
		panel.add(helperLabel);

		questionArea = new EditorPaneAntiAlias(true);
		questionArea.setBackground(Color.WHITE);
		questionArea.setEditable(false);
		questionArea.setPreferredSize(new Dimension(380, 250));
		questionArea.setMaximumSize(new Dimension(380, 250));
		questionArea.setAlignmentX(CENTER_ALIGNMENT);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(questionLabel);
		add(questionArea);
		add(Box.createVerticalStrut(10));
		add(resultLabel);
		add(Box.createVerticalStrut(10));
		add(startButton);
		add(Box.createVerticalStrut(15));
		add(answerLabel);
		add(panel);
		add(answerArea);
		add(Box.createVerticalStrut(10));
		add(answerButton);
		add(resultField);
		resultLabel.setVisible(false);
		resultField.setVisible(false);
		initQuestions();
		setNextQuestion();
	}
	
	
	public void setFormular(Formular f) {
		formular = f;
	}


	public void initQuestions() {
		Path confFile = Paths.get("target/classes/config/config.txt");
		try {
			List<String> conf = Files.readAllLines(confFile, Charset.defaultCharset());
			if(conf.size()==1) {
				String[] questionsTxt = conf.get(0).split(" ");
				QuestionList q;

				for(int i=0; i<questionsTxt.length; i++) {
					q = QuestionList.getQuestion(questionsTxt[i]);
					if(q==null) throw new NullPointerException(questionsTxt[i] + " is not a question.");
					questions.add(new Question(q));
				}
			}
		}catch(IOException e) { e.printStackTrace(); }
		
//		Question question = new Question();
//		question.subject = "<html><font size=\"10\">What are the super classes of the class <b>Type</b>?</font></html>";
//		question.helper = "Give the name of the classes:";
//		questions.add(question);
//
//		question = new Question();
//		question.subject = "<html><font size=\"10\">What is the role </font><font size=\"5\">(i.e. the name)</font><font size=\"10\"> of the relation that links the class <b>State</b> to the class <b>Comment</b>?</font></html>";
//		question.helper = "Give the name of the role:";
//		questions.add(question);
//
//		question = new Question();
//		question.subject = "<html><font size=\"10\">What are the classes <b>directly</b> linked </font><font size=\"5\">(by inheritance, composition, and association)</font><font size=\"10\"> to the class <b>Class?</b></font></html>";
//		question.helper = "Give the name of the classes:";
//		questions.add(question);
//
//		question = new Question();
//		question.subject = "<html><font size=\"10\">What are the name of the, native and inherited, relations and attributes of the class <b>Abstraction</b>?</font></html>";
//		question.helper = "Enumerate the names:";
//		questions.add(question);

//		question = new Question();
//		question.subject = "<html><font size=\"10\">Propose 3 <b>entry points</b> <font size=\"5\">(main classes)</font> into the UML metamodel.</font></html>";
//		question.helper = "Give the name of the classes:";
//		questions.add(question);
	}


	public void setNextQuestion() {
		ReinitView action = new ReinitView();
		action.setModelView(frame.getCanvas());
		if(action.canDo())
			action.doIt();

		currentNbQuestions++;
		if(currentNbQuestions<questions.size())
			setQuestionMode(questions.get(currentNbQuestions));
	}

	public void setQuestionMode(final Question question) {
		sniffer.setQuestion(null);
		questionArea.setText(question.question.getTitle());
		questionLabel.setText("<html><font size=\"+1\"><b>Question " + (currentNbQuestions+1) + "/" + questions.size() + "</b></font></html>");
		startButton.setVisible(true);
		answerArea.setVisible(false);
		answerLabel.setVisible(false);
		answerButton.setVisible(false);
		frame.setActivated(false);
		toolbar.setVisible(false);
		helperLabel.setVisible(false);
		helperLabel.setText(question.question.getHelper());
	}

	public void setAnswerMode() {
		sniffer.setQuestion(questions.get(currentNbQuestions));
		startButton.setVisible(false);
		answerArea.setText("");
		answerArea.setVisible(true);
		answerLabel.setVisible(true);
		answerButton.setVisible(true);
		frame.setActivated(true);
		toolbar.setVisible(true);
		helperLabel.setVisible(true);

        Runnable moveScrollbars = new Runnable() {
            @Override
			public void run() {
            	frame.getCanvas().getScrollpane().getHorizontalScrollBar().setValue(frame.getCanvas().getWidth()/2);
            	frame.getCanvas().getScrollpane().getVerticalScrollBar().setValue(frame.getCanvas().getHeight()/2);
            }
        };

        SwingUtilities.invokeLater(moveScrollbars);
	}


	public void setTerminated() {
		startButton.setVisible(false);
		answerArea.setVisible(false);
		answerLabel.setVisible(false);
		answerButton.setVisible(false);
		frame.setActivated(false);
		toolbar.setVisible(false);
		questionArea.setVisible(false);
		questionLabel.setVisible(false);
		setVisible(false);
		formular.setVisible(true);
		frame.pack();
	}
	
	public void setTerminated2() {
		setVisible(true);
		resultField.setVisible(true);
		resultLabel.setVisible(true);
		resultLabel.setText("<html><center>Return the results by mail to:<br><b>arnaud.blouin@inria.fr</b><br>A backup of the results called \"data.txt\"<br>has been created near the jar file you launch.</center></html>");
		Dimension dim = new Dimension(380, 500);
		resultField.setPreferredSize(dim);
		resultField.setMinimumSize(dim);
		resultField.setText(TYPE_EVAL + "\n" + userInformations + "\n");
		frame.pack();

		for(Question q : questions)
			resultField.setText(resultField.getText() + q + "\n");

		try {
			String fileName = "./data";
			String ext = ".txt";

			if(new File(fileName+ext).exists()) {
				int i=1;

				while(new File(fileName+i+ext).exists())
					i++;

				fileName = fileName + i;
			}

			try(FileWriter fw = new FileWriter(fileName+ext);
				PrintWriter out = new PrintWriter(fw)) {
				out.print(resultField.getText());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}


	class ShowAnswerFieldListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			QuestionsPanel.this.currentTime = System.currentTimeMillis();
			QuestionsPanel.this.setAnswerMode();
			frame.getCanvas().requestFocusInWindow();
		}
	}


	class ShowQuestionFieldListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			final boolean hasNextQuestion = QuestionsPanel.this.currentNbQuestions+1<QuestionsPanel.this.questions.size();
			final Question question = hasNextQuestion ? QuestionsPanel.this.questions.get(QuestionsPanel.this.currentNbQuestions) :
														QuestionsPanel.this.questions.get(QuestionsPanel.this.questions.size()-1);

			question.computeTime(QuestionsPanel.this.currentTime, System.currentTimeMillis());
			question.setAnswer(QuestionsPanel.this.answerArea.getText());

			if(hasNextQuestion)
				QuestionsPanel.this.setNextQuestion();
			else
				QuestionsPanel.this.setTerminated();
			frame.getCanvas().requestFocusInWindow();
		}
	}


	public void setUserInformations(final String userInformations) {
		this.userInformations = userInformations;
	}
}


class EditorPaneAntiAlias extends JEditorPane {
	private static final long serialVersionUID = 1L;

	public EditorPaneAntiAlias(final boolean html) {
		super(html ? "text/html" : "text", "");
	}
}
