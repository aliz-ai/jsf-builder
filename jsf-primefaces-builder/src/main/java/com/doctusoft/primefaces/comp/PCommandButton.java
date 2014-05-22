package com.doctusoft.primefaces.comp;

import org.primefaces.component.commandbutton.CommandButton;

import com.doctusoft.jsf.comp.JsfAbstractButton;
import com.doctusoft.jsf.comp.model.JsfButtonModel;

/**
 * Builds a primefaces {@link CommandButton} component 
 */
public class PCommandButton extends JsfAbstractButton<PCommandButton, JsfButtonModel> {
	
	public PCommandButton(String id) {
		super(id, new JsfButtonModel());
	}
	
	public PCommandButton(String id, String caption) {
		this(id);
		withCaption(caption);
	}
}
