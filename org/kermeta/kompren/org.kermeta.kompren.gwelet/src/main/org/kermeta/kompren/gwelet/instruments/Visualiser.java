package org.kermeta.kompren.gwelet.instruments;

import java.awt.Dimension;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.kermeta.kompren.gwelet.actions.Flat;
import org.kermeta.kompren.gwelet.actions.Slice;
import org.kermeta.kompren.gwelet.actions.ShowHierarchy;
import org.kermeta.kompren.gwelet.eval.QuestionsPanel;
import org.kermeta.kompren.gwelet.eval.QuestionsPanel.TypeEval;
import org.kermeta.kompren.gwelet.instruments.Completioner.Interaction2MoveCamera;
import org.kermeta.kompren.gwelet.model.ModelUtils;
import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.kermeta.kompren.gwelet.ui.MPieMenuButton;
import org.kermeta.kompren.gwelet.view.ClassView;
import org.kermeta.kompren.gwelet.view.ModelViewMapper;
import org.kermeta.kompren.gwelet.visualisation.GweletSlicer;
import org.malai.instrument.Link;
import org.malai.swing.instrument.WidgetInstrument;
import org.malai.swing.interaction.library.ButtonPressed;
import org.malai.swing.ui.UIComposer;
import org.malai.swing.widget.MSpinner;

public class Visualiser extends WidgetInstrument {

	protected MPieMenuButton superClasses;

	protected MPieMenuButton lowerClasses;

	protected MPieMenuButton pruning;

	protected MPieMenuButton flat;

	protected GweletFrame frame;

	protected GweletSlicer slicer;

	protected MSpinner radius;


	public Visualiser(final UIComposer<?> composer) {
		super(composer);
		initialiseWidgets();
		frame 	= (GweletFrame) composer.getWidget();
		slicer 	= new GweletSlicer(frame.getCanvas());
	}


	@Override
	protected void initialiseWidgets() {
		superClasses 	= new MPieMenuButton(new ImageIcon(Class.class.getResource("/res/hierar.png")));
		pruning 		= new MPieMenuButton(new ImageIcon(Class.class.getResource("/res/prune.png")));
		flat 			= new MPieMenuButton(new ImageIcon(Class.class.getResource("/res/flat.png")));
		lowerClasses 	= new MPieMenuButton(new ImageIcon(Class.class.getResource("/res/subType.png")));
		radius 			= new MSpinner(new MSpinner.MSpinnerNumberModel(0, 0, 1000, 1), new JLabel("Radius:"));

		superClasses.setToolTipText("Shows the super classes of the selected class.");
		pruning.setToolTipText("Shows the classes in relation with the selected class.");
		flat.setToolTipText("Shows all the inherited and native properties and operations of the selected class (by flattening its hierarchy).");
		radius.setToolTipText("Sets the radius of the hierarchy and pruning slicing: 0, there is no radius; 1, only the direct classes are kept; etc.");
		radius.setMaximumSize(new Dimension(50, 40));
		radius.setSize(new Dimension(50, 40));

		if(QuestionsPanel.TYPE_EVAL==TypeEval.WITHOUT_VISU_TOOLS)
			radius.setVisible(false);
	}

	@Override
	protected void initialiseLinks() {
		try {
			addLink(new Button2ShowHierarchy(this));
			addLink(new Button2Slice(this));
			addLink(new Button2FocusOnClass(this));
			addLink(new Button2Flat(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void setActivated(final boolean activated) {
		super.setActivated(activated);

		superClasses.setEnabled(activated);
		lowerClasses.setEnabled(activated);
		pruning.setEnabled(activated);
		flat.setEnabled(activated);
	}


	public MPieMenuButton getSuperClasses() {
		return superClasses;
	}


	public MPieMenuButton getLowerClasses() {
		return lowerClasses;
	}


	public MPieMenuButton getPruning() {
		return pruning;
	}


	public MPieMenuButton getFlat() {
		return flat;
	}


	public MSpinner getRadius() {
		return radius;
	}



	private class Button2Flat extends Link<Flat, ButtonPressed, Visualiser> {
		public Button2Flat(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, Flat.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setSlicer(instrument.slicer);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.flat;
		}
	}



	private class Button2FocusOnClass extends Interaction2MoveCamera<ButtonPressed, Visualiser> {
		public Button2FocusOnClass(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, ButtonPressed.class, ins.frame.getZoomer());
		}

		@Override
		public void initAction() {
			if(!instrument.frame.getCanvas().getSelection().isEmpty() &&
				instrument.frame.getCanvas().getSelection().get(0) instanceof ClassView) {
				ClassView cv = (ClassView) instrument.frame.getCanvas().getSelection().get(0);
				String qname = ModelUtils.INSTANCE.getQualifiedName(ModelViewMapper.getMapper().getClassDefinition(cv));
				setAction(qname, instrument.frame.getCanvas(), action);
			}
		}

		@Override
		public boolean isConditionRespected() {
			final AbstractButton but = interaction.getButton();
			return but==instrument.pruning || but==instrument.superClasses || but==instrument.lowerClasses || but==instrument.flat;
		}
	}


	private class Button2Slice extends Link<Slice, ButtonPressed, Visualiser> {
		public Button2Slice(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, Slice.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setSlicer(instrument.slicer);
			action.setRadius((Integer)instrument.radius.getValue());
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.pruning;
		}
	}



	private class Button2ShowHierarchy extends Link<ShowHierarchy, ButtonPressed, Visualiser> {
		public Button2ShowHierarchy(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, ShowHierarchy.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setSlicer(instrument.slicer);
			action.setSuperTypes(interaction.getButton()==instrument.superClasses);
			action.setRadius((Integer)instrument.radius.getValue());
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.superClasses || interaction.getButton()==instrument.lowerClasses;
		}
	}
}
