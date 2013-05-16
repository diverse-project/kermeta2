package org.kermeta.kompren.gwelet.eval;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.ui.rulers.RulerComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public class QuestionsPanel extends Composite {
	public static final TypeEval TYPE_EVAL = TypeEval.WITH_VISU_TOOLS;

	public enum TypeEval {
		WITH_VISU_TOOLS,
		WITHOUT_VISU_TOOLS
	}
	
	public enum QuestionList {
		Q1 {
			@Override public String getTitle() { return "<html><font size=\"6\">What are the super classes of the class <b>Type</b>?</font></html>"; }
			@Override public String getHelper() { return "Give the name of the classes:"; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
		},
		Q2 {
			@Override public String getTitle() { return "<html><font size=\"6\">What is the role </font><font size=\"5\">(i.e. the name)</font><font size=\"10\"> of the relation that links the class <b>State</b> to the class <b>Comment</b>?</font></html>"; }
			@Override public String getHelper() { return "Give the name of the role:"; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
		},
		Q3 {
			@Override public String getTitle() { return "<html><font size=\"6\">What are the classes <b>directly</b> linked </font><font size=\"5\">(by inheritance, composition, and association)</font><font size=\"10\"> to the class <b>Class?</b></font></html>"; }
			@Override public String getHelper() { return "Give the name of the classes:"; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
		},
		Q4 {
			@Override public String getTitle() { return "<html><font size=\"6\">What are the name of the, native and inherited, relations and attributes of the class <b>Abstraction</b>?</font></html>"; }
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

	protected Browser questionArea;

	protected Text answerArea;

	protected int currentNbQuestions;

	protected CLabel questionLabel;

	protected CLabel answerLabel;

	protected CLabel helperLabel;

	protected Button startButton;

	protected Button answerButton;

	protected Text resultField;

	protected Text resultLabel;

	protected List<Question> questions;

	protected long currentTime;

//	protected Sniffer sniffer;

	protected String userInformations;

	protected Composite frame;

	protected Formular formular;
	
	protected RulerComposite editor;
	
	
	protected Combo mouse;

	protected Spinner ageS;

	protected Spinner screen;

	protected Combo statusCB;

	protected Combo xpMdeCB;

	protected Combo xpUmlCB;

	protected Button validateB;
	
	

	public QuestionsPanel(Composite frame, RulerComposite editor) {
		super(frame, SWT.NONE);

		this.editor 	= editor;
		this.frame 		= frame;
		userInformations= "";
//		sniffer 		= new Sniffer(frame);
		questions 		= new ArrayList<Question>();
		currentNbQuestions = -1;

		questionLabel = new CLabel(this, SWT.NONE);
		FontData[] fD = questionLabel.getFont().getFontData();
		fD[0].setHeight(14);
		fD[0].setStyle(SWT.BOLD);
		questionLabel.setFont(new Font(frame.getDisplay(),fD[0]));
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.CENTER;
		questionLabel.setLayoutData(gridData);
		
		questionArea = new Browser(this, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		questionArea.setBackground(frame.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.exclude = false;
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		data.heightHint = 250;
		data.widthHint = 380;
		questionArea.setLayoutData(data);
		
		resultLabel = new Text(this, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		resultLabel.setEditable(false);
		data = new GridData();
		data.exclude = false;
		data.verticalAlignment = SWT.CENTER;
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		data.heightHint = 80;
		data.widthHint = 350;
		resultLabel.setLayoutData(data);
		
		startButton = new Button(this, SWT.NONE);
		fD = startButton.getFont().getFontData();
		fD[0].setHeight(14);
		fD[0].setStyle(SWT.BOLD);
		startButton.setFont(new Font(frame.getDisplay(),fD[0]));
		startButton.setText("Start");
		startButton.addListener(SWT.Selection, new ShowAnswerFieldListener());
		gridData = new GridData();
		gridData.exclude = false;
		gridData.horizontalAlignment = GridData.CENTER;
		startButton.setLayoutData(gridData);
		
		answerLabel = new CLabel(this, SWT.NONE);
		answerLabel.setText("Answer");
		fD = answerLabel.getFont().getFontData();
		fD[0].setHeight(14);
		fD[0].setStyle(SWT.BOLD);
		answerLabel.setFont(new Font(frame.getDisplay(),fD[0]));
		gridData = new GridData();
		gridData.exclude = false;
		gridData.horizontalAlignment = GridData.CENTER;
		answerLabel.setLayoutData(gridData);

		helperLabel = new CLabel(this, SWT.NONE);
		gridData = new GridData();
		gridData.exclude = false;
		gridData.horizontalAlignment = GridData.FILL;
		helperLabel.setLayoutData(gridData);
		
		answerArea = new Text(this, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		answerArea.setBackground(frame.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		data = new GridData();
		data.exclude = false;
		data.horizontalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		data.heightHint = 250;
		data.widthHint = 380;
		answerArea.setLayoutData(data);
		
		answerButton = new Button(this, SWT.NONE);
		fD = answerButton.getFont().getFontData();
		fD[0].setHeight(14);
		fD[0].setStyle(SWT.BOLD);
		answerButton.setFont(new Font(frame.getDisplay(),fD[0]));
		answerButton.setText("Validate Answer");
		answerButton.addListener(SWT.Selection, new ShowQuestionFieldListener());
		gridData = new GridData();
		gridData.exclude = false;
		gridData.horizontalAlignment = GridData.CENTER;
		answerButton.setLayoutData(gridData);

		resultField = new Text(this, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		resultField.setEditable(false);
		resultField.setBackground(frame.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		gridData = new GridData();
		gridData.exclude = false;
		gridData.horizontalAlignment = GridData.FILL;
		resultField.setLayoutData(gridData);

		setLayout(new GridLayout(1, false));
		setSize(380, 800);

		resultLabel.setVisible(false);
		((GridData)resultLabel.getLayoutData()).exclude = true;
		resultField.setVisible(false);
		((GridData)resultField.getLayoutData()).exclude = true;
		initQuestions();
		setNextQuestion();
	}
	
	
	protected void createFormular() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
	
		Group group = new Group(this, SWT.SHADOW_ETCHED_IN);
		group.setText("Required Information");
		GridData gridData = new GridData();
		gridData.exclude = true;
		gridData.horizontalAlignment = GridData.FILL;
		group.setLayoutData(gridData);
		
		CLabel label = new CLabel(group, SWT.NONE);
		label.setText("Mouse/touchpad:");
	
		mouse = new Combo(group, SWT.NONE);
		mouse.setItems(new String[]{"Mouse", "Touchpad"});
	
		label = new CLabel(group, SWT.NONE);
		label.setText("Screen size (inch):");
	
		screen = new Spinner(group, SWT.NONE);
		screen.setValues(15, 1, 50, 0, 1, 1);
	
		label = new CLabel(group, SWT.NONE);
		label.setText("Age:");
	
		ageS = new Spinner(group, SWT.NONE); 
		ageS.setValues(25, 1, 200, 0, 1, 1);
	
		label = new CLabel(group, SWT.NONE);
		label.setText("Status:");
	
		statusCB = new Combo(group, SWT.NONE);
		mouse.setItems(new String[]{"Student", "Ph.D. student", "Engineer", "Researcher"});
	
		label = new CLabel(group, SWT.NONE);
		label.setText("MDE background:");
	
		xpMdeCB = new Combo(group, SWT.NONE);
		mouse.setItems(new String[]{"None", "0-2 years", "2-5 years", "5-10 years", "+10 years"});
	
		label = new CLabel(group, SWT.NONE);
		label.setText("UML background:");
	
		xpUmlCB = new Combo(group, SWT.NONE);
		mouse.setItems(new String[]{"No knowledge", "Few knowledge", "Some knowledge", "Expert"});
	
		validateB = new Button(group, SWT.NONE);
		validateB.setText("Validate");
		gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		group.setLayoutData(validateB);
	//	validateB.addActionListener(new ValideListener());
	}
	
	
//	private void setToolbarVisibility(final boolean visible) {
////		IWorkbenchWindow workbenchWindow =  PlatformUI.getWorkbench().getActiveWorkbenchWindow();
////	    IContributionItem[] items = ((WorkbenchWindow)workbenchWindow).getMenuBarManager().getItems();
////	    for (IContributionItem item : items)
////	        item.setVisible(visible);
////	    ((WorkbenchWindow)workbenchWindow).getMenuBarManager().setVisible(visible);
////	    ((WorkbenchWindow)workbenchWindow).getMenuBarManager().update();
////	    System.out.println(visible + " coucou\n---------");
////	    items = ((WorkbenchWindow)workbenchWindow).getCoolBarManager2().getItems();
////	    for (IContributionItem item : items)
////	        item.setVisible(visible);
////	    ((WorkbenchWindow)workbenchWindow).getCoolBarManager2().update(true);
////	    ((WorkbenchWindow)workbenchWindow).getCoolBarManager().setVisible(visible);
//	    
//	    try {
//	        IHandlerService service = (IHandlerService) PlatformUI
//	                .getWorkbench().getActiveWorkbenchWindow().getService(IHandlerService.class);
//	        if(service != null)
//	            service.executeCommand("org.eclipse.ui.ToggleCoolbarAction", null);
//	    } catch (Exception e) {
//	        //handle error
//	    }
//	}
	
	
//	public void setFormular(Formular f) {
//		formular = f;
//	}


	public void initQuestions() {
		try {
			URL url = new URL("platform:/plugin/org.eclipse.emf.ecoretools.diagram/config/config.txt");
			InputStream inputStream = url.
					openConnection().
					getInputStream();
			BufferedReader in 		= new BufferedReader(new InputStreamReader(inputStream));
			String[] questionsTxt	= in.readLine().split(" ");
			in.close();
			QuestionList q;

			for(int i=0; i<questionsTxt.length; i++) {
				q = QuestionList.getQuestion(questionsTxt[i]);
				if(q==null) throw new NullPointerException(questionsTxt[i] + " is not a question.");
				questions.add(new Question(q));
			}
		}catch(Exception e1) {e1.printStackTrace();}
	}


	public void setNextQuestion() {
//		ReinitView action = new ReinitView();
//		action.setModelView(frame.getCanvas());
//		if(action.canDo())
//			action.doIt();

		currentNbQuestions++;
		if(currentNbQuestions<questions.size())
			setQuestionMode(questions.get(currentNbQuestions));
	}

	public void setQuestionMode(final Question question) {
//		sniffer.setQuestion(null);
		questionArea.setText(question.question.getTitle());
		questionLabel.setText("Question " + (currentNbQuestions+1) + "/" + questions.size());
		startButton.setVisible(true);
		((GridData)startButton.getLayoutData()).exclude = false;
		answerArea.setVisible(false);
		((GridData)answerArea.getLayoutData()).exclude = true;
		answerLabel.setVisible(false);
		((GridData)answerLabel.getLayoutData()).exclude = true;
		answerButton.setVisible(false);
		((GridData)answerButton.getLayoutData()).exclude = true;
//		setToolbarVisibility(false);
		helperLabel.setVisible(false);
		((GridData)helperLabel.getLayoutData()).exclude = true;
		helperLabel.setText(question.question.getHelper());
		editor.setVisible(false);
		editor.setEnabled(false);
		layout(true);
		pack();
	}

	public void setAnswerMode() {
//		sniffer.setQuestion(questions.get(currentNbQuestions));
		startButton.setVisible(false);
		((GridData)startButton.getLayoutData()).exclude = true;
		answerArea.setText("");
		answerArea.setVisible(true);
		((GridData)answerArea.getLayoutData()).exclude = false;
		answerLabel.setVisible(true);
		((GridData)answerLabel.getLayoutData()).exclude = false;
		answerButton.setVisible(true);
		((GridData)answerButton.getLayoutData()).exclude = false;
//		setToolbarVisibility(true);
		helperLabel.setVisible(true);
		((GridData)helperLabel.getLayoutData()).exclude = false;
		editor.setVisible(true);
		editor.setEnabled(true);
		layout(true);
		pack();

//        Runnable moveScrollbars = new Runnable() {
//            @Override
//			public void run() {
//            	frame.getCanvas().getScrollpane().getHorizontalScrollBar().setValue(frame.getCanvas().getWidth()/2);
//            	frame.getCanvas().getScrollpane().getVerticalScrollBar().setValue(frame.getCanvas().getHeight()/2);
//            }
//        };
//
//        SwingUtilities.invokeLater(moveScrollbars);
	}


	public void setTerminated() {
		startButton.setVisible(false);
		((GridData)startButton.getLayoutData()).exclude = true;
		answerArea.setVisible(false);
		((GridData)answerArea.getLayoutData()).exclude = true;
		answerLabel.setVisible(false);
		((GridData)answerLabel.getLayoutData()).exclude = true;
		answerButton.setVisible(false);
		((GridData)answerButton.getLayoutData()).exclude = true;
//		frame.setActivated(false);
//		toolbar.setVisible(false);
		questionArea.setVisible(false);
		((GridData)questionArea.getLayoutData()).exclude = true;
		questionLabel.setVisible(false);
		((GridData)questionLabel.getLayoutData()).exclude = true;
		setVisible(false);
//		formular.setVisible(true);//TODO
		frame.pack();
	}
	
	public void setTerminated2() {
		setVisible(true);
		resultField.setVisible(true);
		((GridData)resultField.getLayoutData()).exclude = false;
		resultLabel.setVisible(true);
		((GridData)resultLabel.getLayoutData()).exclude = false;
		resultLabel.setText("<html><center>Return the results by mail to:<br><b>arnaud.blouin@inria.fr</b><br>A backup of the results called \"data.txt\"<br>has been created near the jar file you launch.</center></html>");
//		Dimension dim = new Dimension(380, 500);
//		resultField.setPreferredSize(dim);
//		resultField.setMinimumSize(dim);
		resultField.setText(TYPE_EVAL + "\n" + userInformations + "\n");
		frame.pack();

		for(Question q : questions)
			resultField.setText(resultField.getText() + q + "\n");

//		try {
//			String fileName = "./data";
//			String ext = ".txt";
//
//			if(new File(fileName+ext).exists()) {
//				int i=1;
//
//				while(new File(fileName+i+ext).exists())
//					i++;
//
//				fileName = fileName + i;
//			}
//
//			try(FileWriter fw = new FileWriter(fileName+ext);
//				PrintWriter out = new PrintWriter(fw)) {
//				out.print(resultField.getText());
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}


	class ShowAnswerFieldListener implements Listener {
		public void handleEvent(final Event e) {
			QuestionsPanel.this.currentTime = System.currentTimeMillis();
			QuestionsPanel.this.setAnswerMode();
		}
	}


	class ShowQuestionFieldListener implements Listener {
		public void handleEvent(final Event e) {
			final boolean hasNextQuestion = QuestionsPanel.this.currentNbQuestions+1<QuestionsPanel.this.questions.size();
			final Question question = hasNextQuestion ? QuestionsPanel.this.questions.get(QuestionsPanel.this.currentNbQuestions) :
														QuestionsPanel.this.questions.get(QuestionsPanel.this.questions.size()-1);

			question.computeTime(QuestionsPanel.this.currentTime, System.currentTimeMillis());
			question.setAnswer(QuestionsPanel.this.answerArea.getText());

			if(hasNextQuestion)
				QuestionsPanel.this.setNextQuestion();
			else
				QuestionsPanel.this.setTerminated();
		}
	}


	public void setUserInformations(final String userInformations) {
		this.userInformations = userInformations;
	}
}
