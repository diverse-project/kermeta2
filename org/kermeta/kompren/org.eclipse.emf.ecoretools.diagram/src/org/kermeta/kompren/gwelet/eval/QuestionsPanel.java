package org.kermeta.kompren.gwelet.eval;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.emf.ecoretools.diagram.edit.parts.EClassEditPart;
import org.eclipse.emf.ecoretools.diagram.part.EcoreDiagramEditor;
import org.eclipse.gef.ui.rulers.RulerComposite;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.render.editparts.RenderedDiagramRootEditPart;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class QuestionsPanel extends Composite {
	public static final TypeEval TYPE_EVAL = TypeEval.WITHOUT_VISU_TOOLS;
	public static final String END_MSG = "---END---";

	public enum TypeEval {
		WITH_VISU_TOOLS,
		WITHOUT_VISU_TOOLS
	}
	
	public enum QuestionList {
		T1A_UML{
			@Override public String getTitle() { return "<html><font size=\"5\">If you have to create an instance of the class <b>Operation</b> corresponding to the operation <b>Double add(Double value)</b>, what would be the other concrete classes of the metamodel to instantiate?</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Operation"; }
		},
		T1A_RAM{
			@Override public String getTitle() { return "<html><font size=\"5\">If you have to create an instance of the class <b>Operation</b> corresponding to the operation <b>Double add(Double value)</b>, what would be the other concrete classes of the metamodel to instantiate?</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Operation"; }
		},
		T1B_UML{
			@Override public String getTitle() { return "<html><font size=\"5\">If you have to create an instance of the class <b>ConditionalNode</b>, what would be the mandatory concrete classes in relation with <b>ConditionalNode</b> that must be also instantiated?</font></html>"; }
			@Override public String getHelper() { return "<html><font size=\"4\">The concept of mandatory classes has been explained during the tutorial and are summarised in the drawings sketched on the whiteboard.</font></html>"; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.ConditionalNode"; }
		},
		T1B_RAM{
			@Override public String getTitle() { return "<html><font size=\"5\">If you have to create an instance of the class <b>Message</b>, what would be the mandatory concrete classes in relation with <b>Message</b> that must be also instantiated?</font></html>"; }
			@Override public String getHelper() { return "<html><font size=\"4\">The concept of mandatory classes has been explained during the tutorial and are summarised in the drawings sketched on the whiteboard.</font></html>"; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Message"; }
		},
		T2A_UML{
			@Override public String getTitle() { return "<html><font size=\"5\">List the name of the abstract classes in the super class hierarchy of <b>FlowFinalNode</b> that are not doing much (i.e. that do not contain attributes, operations, and output references/compositions) and that can be removed</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.FlowFinalNode"; }
		},
		T2A_RAM{
			@Override public String getTitle() { return "<html><font size=\"5\">List the name of the abstract classes in the super class hierarchy of <b>Class</b> that are not doing much (i.e. that do not contain attributes, operations, and output references/compositions) and that can be removed</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Class"; }
		},
		T2B_UML{
			@Override public String getTitle() { return "<html><font size=\"5\">Give the name of the redundant attribute (direct or inherited) of the class <b>Device</b> (i.e. same name and type)</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Device"; }
		},
		T2B_RAM{
			@Override public String getTitle() { return "<html><font size=\"5\">Give the name of the redundant attribute (direct or inherited) of the class <b>Reference</b> (i.e. same name and type)</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Reference"; }
		},
		T3A_UML{
			@Override public String getTitle() { return "<html><font size=\"5\">The classes <b>Actor</b> and <b>Trigger</b> are coupled only by one unique reference via another class. Give the name of this reference that would make these classes independent if removed</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Actor"; }
		},
		T3A_RAM{
			@Override public String getTitle() { return "<html><font size=\"5\">The classes <b>Aspect</b> and <b>Type</b> are coupled only by one unique reference via another class. Give the name of this reference that would make these classes independent if removed</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Aspect"; }
		},
		T3B_UML{
			@Override public String getTitle() { return "<html><font size=\"5\">Give the name of at least one class that has a high number of incoming and a high number of outgoing references compared to the other classes</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Class"; }
		},
		T3B_RAM{
			@Override public String getTitle() { return "<html><font size=\"5\">Give the name of at least one class that has a high number of incoming and a high number of outgoing references compared to the other classes</html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Class"; }
		},
		T4A_UML{
			@Override public String getTitle() { return "<html><font size=\"5\">Give the name of at least one intermediate class between the class <b>State</b> to the class <b>Transition</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.State"; }
		},
		T4A_RAM{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of at least one intermediate class between the class <b>LifeLine</b> to the class <b>FragmentContainer</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Aspect"; }
		},
		T4B_UML{
			@Override public String getTitle() { return "<html><font size=\"5\">Enumerate the name of all the attributes (direct or inherited) of the class <b>Feature</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Feature"; }
		},
		T4B_RAM{
			@Override public String getTitle() { return "<html><font size=\"5\">Enumerate the name of all the attributes (direct or inherited) of the class <b>RInt</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.RInt"; }
		},
		TUTORIAL1{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of the super and lower classes of the class <b>State</b></font></html>"; }
			@Override public String getHelper() { return "Use the super/sub classes features.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.State"; }
		},
		TUTORIAL2{
			@Override public String getTitle() { return "<html><font size=\"6\">What are the classes linked, directly or undirectly, by composition to the class <b>Interaction</b></font></html>"; }
			@Override public String getHelper() { return "Use the pruning+composition feature.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.Interaction"; }
		},
		TUTORIAL3{
			@Override public String getTitle() { return "<html><font size=\"6\">What are the classes linked, directly or undirectly, to the class <b>Interaction</b> by relations which min cardinality equals 1</font></html>"; }
			@Override public String getHelper() { return "Use the pruning+card1 feature.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.Interaction"; }
		},
		TUTORIAL4{
			@Override public String getTitle() { return "<html><font size=\"6\">What are the classes <b>directly</b> linked to the class <b>State</b></font></html>"; }
			@Override public String getHelper() { return "Use the pruning+radius feature.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.State"; }
		},
		TUTORIAL5{
			@Override public String getTitle() { return "<html><font size=\"6\">What are the name of the attributes, native or inherited, of the class <b>AbortingState</b></font></html>"; }
			@Override public String getHelper() { return "Use the flattening feature.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.AbortingState"; }
		},
		TUTORIAL6{
			@Override public String getTitle() { return "<html><font size=\"6\">Gives the name of all the classes in relation (direct or undirect) with the class <b>Transition</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.Transition"; }
		},
		TUTORIAL7{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of the attributes (inherited or native) of the class <b<Interaction</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.Interaction"; }
		};
		
		public abstract String getTitle();
		public abstract Metamodel getMetamodel();
		public abstract String getHelper();
		public abstract String getInitialClassToFocusOn();
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
		RAM,
		INTERACTION
	}

	protected boolean isTutorial = false;
	
	protected boolean questionsAreEnding;

	protected Browser questionArea;

	protected Text answerArea;

	protected int currentNbQuestions;

	protected CLabel questionLabel;

	protected CLabel answerLabel;

	protected Browser helperLabel;

	protected Button startButton;

	protected Button answerButton;

	protected Text resultField;

	protected Browser resultLabel;

	protected List<Question> questions;

	protected long currentTime;

	protected Sniffer sniffer;

	protected String userInformations;

	protected Composite frame;

	protected RulerComposite editor;
	
	protected Group formular;
	
	protected Combo mouse;

	protected Spinner ageS;

	protected Spinner screen;

	protected Combo statusCB;

	protected Combo xpMdeCB;

	protected Combo xpUmlCB;
	protected Combo xpRAMCB;

	protected Button validateB;
	
	

	public QuestionsPanel(Composite frame, RulerComposite editor) {
		super(frame, SWT.NONE);

		this.editor 	= editor;
		this.frame 		= frame;
		userInformations= "";
		sniffer 		= new Sniffer((FigureCanvas) editor.getChildren()[0], editor);
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
		
		helperLabel = new Browser(this, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		gridData = new GridData();
		gridData.exclude = false;
		gridData.heightHint = 130;
		gridData.widthHint = 380;
		gridData.horizontalAlignment = GridData.FILL;
		helperLabel.setLayoutData(gridData);
		
		resultLabel = new Browser(this, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		data = new GridData();
		data.exclude = false;
		data.verticalAlignment = SWT.CENTER;
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		data.heightHint = 130;
		data.widthHint = 330;
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
		gridData.heightHint = 500;
		gridData.widthHint = 330;
		resultField.setLayoutData(gridData);

		createFormular();
		
		setLayout(new GridLayout(1, false));
		setSize(380, 800);

		resultLabel.setVisible(false);
		((GridData)resultLabel.getLayoutData()).exclude = true;
		resultField.setVisible(false);
		((GridData)resultField.getLayoutData()).exclude = true;
		initQuestions();
		setNextQuestion(false);
	}
	
	
	protected void createFormular() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
	
		formular = new Group(this, SWT.SHADOW_ETCHED_IN);
		formular.setText("Required Information");
		GridData gridData = new GridData();
		gridData.exclude = true;
		gridData.widthHint = 300;
		formular.setLayoutData(gridData);
		formular.setVisible(false);
		formular.setLayout(gridLayout);
		
		CLabel label = new CLabel(formular, SWT.NONE);
		label.setText("Mouse/touchpad:");
		label.setVisible(true);
	
		mouse = new Combo(formular, SWT.READ_ONLY);
		mouse.setItems(new String[]{"Mouse", "Touchpad"});
		mouse.setText(mouse.getItem(0));
	
		label = new CLabel(formular, SWT.NONE);
		label.setText("Screen size (inch):");
	
		screen = new Spinner(formular, SWT.NONE);
		screen.setValues(15, 1, 50, 0, 1, 1);
	
		label = new CLabel(formular, SWT.NONE);
		label.setText("Age:");
	
		ageS = new Spinner(formular, SWT.NONE); 
		ageS.setValues(30, 1, 200, 0, 1, 1);
	
		label = new CLabel(formular, SWT.NONE);
		label.setText("Status:");
	
		statusCB = new Combo(formular, SWT.READ_ONLY);
		statusCB.setItems(new String[]{"Researcher", "Industrial", "Research engineer", "Ph.D. student", "Other"});
	
		label = new CLabel(formular, SWT.NONE);
		label.setText("MDE background:");
	
		xpMdeCB = new Combo(formular, SWT.READ_ONLY);
		xpMdeCB.setItems(new String[]{"Expert", "Proficient", "Competent", "Advanced beginner", "Novice"});
	
		label = new CLabel(formular, SWT.NONE);
		label.setText("UML background:");
	
		xpUmlCB = new Combo(formular, SWT.READ_ONLY);
		xpUmlCB.setItems(new String[]{"Expert", "Proficient", "Competent", "Advanced beginner", "Novice"});
		
		label = new CLabel(formular, SWT.NONE);
		label.setText("RAM background:");
		
		xpRAMCB = new Combo(formular, SWT.READ_ONLY);
		xpRAMCB.setItems(new String[]{"Expert", "Proficient", "Competent", "Advanced beginner", "Novice"});
	
		validateB = new Button(formular, SWT.NONE);
		validateB.setText("Validate");
		gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		validateB.setLayoutData(gridData);
		validateB.addListener(SWT.Selection, new ValideListener());
	}
	
	
	class ValideListener implements Listener {
		public void handleEvent(final Event e) {
			QuestionsPanel.this.formular.setVisible(false);
			((GridData)formular.getLayoutData()).exclude = true;
			
			QuestionsPanel.this.pack();
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			QuestionsPanel.this.setUserInformations(ageS.getText() + "\t" + statusCB.getText() +
					"\t" + xpMdeCB.getText() + "\t" + xpUmlCB.getText() + "\t" + xpRAMCB.getText() +
					"\t" + mouse.getText() + "\t" + screen.getText() +
					"\t" + dim.width + "\t" + dim.height);
			QuestionsPanel.this.setTerminated2();
		}

	}
	
	
	
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
			
			if("S".equals(questionsTxt[0])) questionsAreEnding = false; // Starting
			else if("E".equals(questionsTxt[0])) questionsAreEnding = true; // Ending
			else if("U".equals(questionsTxt[0])) questionsAreEnding = true; // Unique
			else if("T".equals(questionsTxt[0])) questionsAreEnding = true; isTutorial = true; // Unique
			
			String t1 = "<html><center><b>Thank you!</b>";
			String t2 = "<br>A backup of the results called \"data.txt\"<br>has been created in your home dir.</center></html>";
			
			if(questionsAreEnding)
				resultLabel.setText(t1 + t2);
			else
				resultLabel.setText(t1 + "<br><b>Now, use the Kompren editor to complete the experiment.</b>" + t2);

			for(int i=1; i<questionsTxt.length; i++) {
				q = QuestionList.getQuestion(questionsTxt[i]);
				if(q==null) throw new NullPointerException(questionsTxt[i] + " is not a question.");
				questions.add(new Question(q));
			}
			
			Path dataFile = Paths.get("./data.txt");
			StringBuilder res = new StringBuilder();

			if(Files.exists(dataFile)) {
				List<String> linesRes = Files.readAllLines(dataFile, Charset.defaultCharset());
				if(!linesRes.isEmpty() && !linesRes.get(linesRes.size()-1).equals(END_MSG)) {
					for(String line : linesRes)
						res.append(line).append('\n');
					resultField.setText(res.toString());
					
					for(Question question : questions)
						if(existsLineStartingWith(linesRes, question.question.name()))
							currentNbQuestions++;
				}
			}
		}catch(Exception e1) {e1.printStackTrace();}
	}
	
	
	private boolean existsLineStartingWith(List<String> linesRes, String name) {
		for(String line : linesRes)
			if(line.startsWith(name))
				return true;
		return false;
	}


	public void setNextQuestion(boolean serialise) {
		execute(new String[] {"git", "reset", "--hard"}, new File("/home/ablouin/wpXP/testProject"));
		try {
			ResourcesPlugin.getWorkspace().getRoot().getProjects()[0].refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) { e.printStackTrace(); }
		
		if(currentNbQuestions>=0 && serialise) {
			resultField.setText(resultField.getText() + questions.get(currentNbQuestions) + "\n");
			saveResults();
		}
		
		currentNbQuestions++;
		if(currentNbQuestions<questions.size())
			setQuestionMode(questions.get(currentNbQuestions));
	}
	
	
	private static String execute(final String[] cmd, final File tmpdir) {
		if(cmd==null || cmd.length==0)
			return null;

		try {
			Process process 	 = Runtime.getRuntime().exec(cmd, null, tmpdir);  // Command launched
			StreamExecReader err = new StreamExecReader(process.getErrorStream());// Catch the error log
			StreamExecReader inp = new StreamExecReader(process.getInputStream());// Catch the log

			err.start();
			inp.start();

			process.waitFor();// Waiting for the end of the process.

			return err.getLog() + System.getProperty("line.separator") + inp.getLog();
		} catch(Exception e) {
			e.printStackTrace();
			return ""; //$NON-NLS-1$
		}
	}
	

	public void setQuestionMode(final Question question) {
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		if(editorPart!=null && !editorPart.getTitle().split("\\.")[0].equals(question.question.getMetamodel().name())) {
			editorPart.getEditorSite().getPage().closeEditor(editorPart, false);
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = myWorkspaceRoot.getProjects()[0];
			IFile file = project.getFile("src/"+question.question.getMetamodel().name()+".ecorediag");
			FileEditorInput fei = new FileEditorInput(file);
			
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		    IWorkbenchPage page = window.getActivePage();
		    try { page.openEditor(fei, "org.eclipse.emf.ecoretools.diagram.part.EcoreDiagramEditorID"); } 
		    catch (PartInitException e) { e.printStackTrace(); }
		}
		else {
			sniffer.setQuestion(null);
			questionArea.setText(question.question.getTitle());
			if(isTutorial)
				questionLabel.setText("Question " + (currentNbQuestions+1) + "/" + questions.size() + " -- Tutorial");
			else
				questionLabel.setText("Question " + (currentNbQuestions+1) + "/" + questions.size() + " -- " +
					questions.get(currentNbQuestions).question.getMetamodel() + " metamodel");
			startButton.setVisible(true);
			((GridData)startButton.getLayoutData()).exclude = false;
			helperLabel.setVisible(question.question.getHelper()!=null && question.question.getHelper().length()>0);
			((GridData)helperLabel.getLayoutData()).exclude = !helperLabel.isVisible();
			answerArea.setVisible(false);
			((GridData)answerArea.getLayoutData()).exclude = true;
			answerLabel.setVisible(false);
			((GridData)answerLabel.getLayoutData()).exclude = true;
			answerButton.setVisible(false);
			((GridData)answerButton.getLayoutData()).exclude = true;
			helperLabel.setText(question.question.getHelper());
			editor.setVisible(false);
			editor.setEnabled(false);
			layout(true);
			pack();
		}
	}

	public void setAnswerMode() {
		sniffer.setQuestion(questions.get(currentNbQuestions));
		startButton.setVisible(false);
		((GridData)startButton.getLayoutData()).exclude = true;
		answerArea.setText("");
		answerArea.setVisible(true);
		((GridData)answerArea.getLayoutData()).exclude = false;
		answerLabel.setVisible(true);
		((GridData)answerLabel.getLayoutData()).exclude = false;
		answerButton.setVisible(true);
		((GridData)answerButton.getLayoutData()).exclude = false;
		editor.setVisible(true);
		editor.setEnabled(true);
		layout(true);
		pack();
		
        Runnable moveScrollbars = new Runnable() {
			public void run() {
        		final org.eclipse.draw2d.geometry.Point cv = getClassLocation(questions.get(currentNbQuestions).question.getInitialClassToFocusOn());
        		if(cv==null)
        			System.err.println("CLASS NOT FOUND: " + questions.get(currentNbQuestions).question.getInitialClassToFocusOn() + " in QuestionPanel");
        		else {
        			FigureCanvas fc = (FigureCanvas) editor.getChildren()[0];
        			IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
        			RenderedDiagramRootEditPart ren = (RenderedDiagramRootEditPart) ((EcoreDiagramEditor) editorPart).getDiagramEditPart().getRoot();
        			double zoom = ren.getZoomManager().getZoom();
        			fc.scrollTo((int) (zoom*cv.x)-editor.getSize().x/2, (int) (zoom*cv.y)-editor.getSize().y/2);
        		}
            }
        };
        
        
        Display.getDefault().syncExec(moveScrollbars);
	}
	
	
	public org.eclipse.draw2d.geometry.Point getClassLocation(String name) {
		String className = name.split("\\.")[1];
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		if(editorPart instanceof EcoreDiagramEditor) {
			DiagramEditPart host = ((EcoreDiagramEditor) editorPart).getDiagramEditPart();
			for(Object obj : host.getChildren()) {
				if(obj instanceof EClassEditPart && ((EClassEditPart)obj).getPrimaryShape().getFigureClassNameLabel().getText().equals(className))
					return ((EClassEditPart)obj).getLocation();
			}
		}
		return null;
	}
	
	
	public void setTerminated() {
		editor.setVisible(false);
		editor.setEnabled(false);
		startButton.setVisible(false);
		((GridData)startButton.getLayoutData()).exclude = true;
		answerArea.setVisible(false);
		((GridData)answerArea.getLayoutData()).exclude = true;
		answerLabel.setVisible(false);
		((GridData)answerLabel.getLayoutData()).exclude = true;
		answerButton.setVisible(false);
		((GridData)answerButton.getLayoutData()).exclude = true;
		questionArea.setVisible(false);
		((GridData)questionArea.getLayoutData()).exclude = true;
		questionLabel.setVisible(false);
		((GridData)questionLabel.getLayoutData()).exclude = true;
		if(questionsAreEnding) {
			formular.setVisible(true);
			((GridData)formular.getLayoutData()).exclude = false;
		}
		else
			setTerminated2();
		frame.pack();
	}
	
	public void setTerminated2() {
		setVisible(true);
		resultField.setVisible(true);
		((GridData)resultField.getLayoutData()).exclude = false;
		resultLabel.setVisible(true);
		((GridData)resultLabel.getLayoutData()).exclude = false;
		
		if(isTutorial)
			resultField.setText("");
		else {
			if(!questions.isEmpty())
				resultField.setText(resultField.getText() + questions.get(questions.size()-1) + "\n");
			
			resultField.setText(resultField.getText() + "\n" + TYPE_EVAL + "\n" + userInformations + "\n" + END_MSG);
		}
		
		resultField.setText(resultField.getText() + "\n" + TYPE_EVAL + "\n" + userInformations + "\n" + END_MSG);
		frame.pack();
		saveResults();
	}
	
	
	protected void saveResults() {
		if(!isTutorial)
			try {
				FileWriter fw = new FileWriter("./data.txt");
				PrintWriter out = new PrintWriter(fw);
				out.print(resultField.getText());
				out.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
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
				QuestionsPanel.this.setNextQuestion(true);
			else
				QuestionsPanel.this.setTerminated();
		}
	}


	public void setUserInformations(final String userInformations) {
		this.userInformations = userInformations;
	}
}
