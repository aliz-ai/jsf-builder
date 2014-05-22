package com.doctusoft.primefaces.comp;

import org.primefaces.component.commandbutton.CommandButton;

import com.doctusoft.jsf.comp.JsfAbstractButton;
import com.doctusoft.jsf.comp.model.JsfButtonModel;

/**
 * Builds a primefaces {@link CommandButton} component 
 */
public class PCommandButton extends JsfAbstractButton<PCommandButton, JsfButtonModel> {
	
	public PCommandButton() {
		super(new JsfButtonModel());
	}
	
	public PCommandButton(String caption) {
		this();
		withCaption(caption);
	}
}
