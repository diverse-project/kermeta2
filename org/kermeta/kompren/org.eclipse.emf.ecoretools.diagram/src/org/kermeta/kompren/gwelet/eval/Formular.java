package org.kermeta.kompren.gwelet.eval;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Spinner;

public class Formular extends Composite {
	protected QuestionsPanel questionsPanel;

	protected Composite frame;

	protected Combo mouse;

	protected Spinner ageS;

	protected Spinner screen;

	protected Combo statusCB;

	protected Combo xpMdeCB;

	protected Combo xpUmlCB;

	protected Button validateB;


	public Formular(final QuestionsPanel questionsPanel, final Composite frame) {
		super(frame, SWT.NONE);
		this.frame			= frame;
		this.questionsPanel = questionsPanel;
		createFormular();
	}



	protected void createFormular() {
//  		GridBagConstraints constraint = new GridBagConstraints();
//    	constraint.gridx = 0;  		constraint.gridy = 0;
//     	constraint.gridwidth = 1; 	constraint.gridheight = 1;
//     	constraint.weightx = 0.1; 	constraint.weighty = 0.1;
//     	constraint.fill = GridBagConstraints.HORIZONTAL;
//     	constraint.anchor = GridBagConstraints.WEST;

     	Composite questionsP = new Composite(this, SWT.NONE);
//     	questionsP.setBorder(new TitledBorder("Required Information"));
//     	questionsP.setLayout(new GridBagLayout());

//		questionsP.add(new JLabel("Mouse/touchpad:"), constraint);
//		constraint.gridx++;

		mouse = new Combo(questionsP, SWT.NONE);
		mouse.setItems(new String[]{"Mouse", "Touchpad"});
//		constraint.gridx=0;
//		constraint.gridy++;

//     	questionsP.add(new JLabel("Screen size (inch):"), constraint);
//     	constraint.gridx++;

		screen = new Spinner(questionsP, SWT.NONE);
		screen.setValues(15, 1, 50, 0, 1, 1);
//		constraint.gridx=0;
//		constraint.gridy++;

//		questionsP.add(new JLabel("Name:"), constraint);
//		constraint.gridx++;

//     	questionsP.add(new JLabel("Age:"), constraint);
//     	constraint.gridx++;

		ageS = new Spinner(questionsP, SWT.NONE); 
		ageS.setValues(25, 1, 200, 0, 1, 1);
//		constraint.gridx=0;
//		constraint.gridy++;

//		questionsP.add(new JLabel("Gender:"), constraint);
//		constraint.gridx++;

//		questionsP.add(new JLabel("Status:"), constraint);
//		constraint.gridx++;

		statusCB = new Combo(questionsP, SWT.NONE);
		mouse.setItems(new String[]{"Student", "Ph.D. student", "Engineer", "Researcher"});
//		constraint.gridx=0;
//		constraint.gridy++;

//		questionsP.add(new JLabel("MDE background:"), constraint);
//		constraint.gridx++;

		xpMdeCB = new Combo(questionsP, SWT.NONE);
		mouse.setItems(new String[]{"None", "0-2 years", "2-5 years", "5-10 years", "+10 years"});
//		constraint.gridx=0;
//		constraint.gridy++;

//		questionsP.add(new JLabel("UML background:"), constraint);
//		constraint.gridx++;

		xpUmlCB = new Combo(questionsP, SWT.NONE);
		mouse.setItems(new String[]{"No knowledge", "Few knowledge", "Some knowledge", "Expert"});
//		constraint.gridx=0;
//		constraint.gridy++;

//		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		RowLayout rowLayout = new RowLayout();
		rowLayout.wrap = false;
		rowLayout.pack = false;
		rowLayout.justify = true;
		rowLayout.type = SWT.VERTICAL;
		rowLayout.marginLeft = 5;
		rowLayout.marginTop = 5;
		rowLayout.marginRight = 5;
		rowLayout.marginBottom = 5;
		rowLayout.spacing = 0;
		setLayout(rowLayout);

		Composite buttonP = new Composite(this, SWT.NONE);
		validateB = new Button(buttonP, SWT.NONE);
		validateB.setText("Validate");
//		validateB.addActionListener(new ValideListener());
	}


//	class ValideListener implements ActionListener {
//		@Override
//		public void actionPerformed(final ActionEvent e) {
//			Formular.this.setVisible(false);
//			Formular.this.questionsPanel.setTerminated2();
////			Formular.this.frame.pack();
//			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//			Formular.this.frame.setLocation((dim.width-Formular.this.frame.getWidth())/2,
//											(dim.height-Formular.this.frame.getHeight())/2);
//			Formular.this.questionsPanel.setUserInformations(//name.getText() + "\t" + 
//											ageS.getValue().toString() + "\t" +
////					sexCB.getSelectedItem().toString() + "\t" + 
//											statusCB.getSelectedItem().toString() +
//					"\t" + xpMdeCB.getSelectedItem().toString() + "\t" + xpUmlCB.getSelectedItem().toString() +
//					"\t" + mouse.getSelectedItem().toString() + "\t" + screen.getValue().toString() +
//					"\t" + dim.width + "\t" + dim.height);
//			Formular.this.frame.setExtendedState(Frame.MAXIMIZED_BOTH);
//		}
//
//	}
}
