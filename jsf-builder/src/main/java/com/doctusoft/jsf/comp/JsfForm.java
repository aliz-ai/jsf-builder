package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.IsNamingContainer;
import com.doctusoft.jsf.comp.model.JsfFormModel;

public class JsfForm extends JsfBaseComponent<JsfForm, JsfFormModel> implements IsNamingContainer {
	
	public JsfForm(String id) {
		super(id, new JsfFormModel());
	}
	
}
