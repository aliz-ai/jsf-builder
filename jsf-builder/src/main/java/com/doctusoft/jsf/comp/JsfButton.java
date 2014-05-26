package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfButtonModel;

public class JsfButton extends JsfAbstractButton<JsfButton, JsfButtonModel> {
	
	public JsfButton(String id) {
		super(id, new JsfButtonModel());
	}
	
	public JsfButton(String id, String caption) {
		this(id);
		withCaption(caption);
	}
	
}
