package com.doctusoft.primefaces.comp;

import org.primefaces.component.commandbutton.CommandButton;

import com.doctusoft.jsf.comp.JsfAbstractButton;
import com.doctusoft.primefaces.comp.model.PCommandButtonModel;

/**
 * Builds a primefaces {@link CommandButton} component 
 */
public class PCommandButton extends JsfAbstractButton<PCommandButton, PCommandButtonModel> {
	
	public PCommandButton(String id) {
		super(id, new PCommandButtonModel());
	}
	
	public PCommandButton(String id, String caption) {
		this(id);
		withCaption(caption);
	}
}
