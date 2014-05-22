package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfFormModel;

public class JsfForm extends JsfBaseComponent<JsfForm, JsfFormModel>{
	
	public JsfForm(String id) {
		super(id, new JsfFormModel());
	}
	
}
