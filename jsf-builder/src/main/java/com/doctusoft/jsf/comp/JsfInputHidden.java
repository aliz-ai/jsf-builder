package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfInputHiddenModel;

public class JsfInputHidden extends JsfAbstractInput<JsfInputHidden, String, JsfInputHiddenModel> {

	public JsfInputHidden(String id) {
		super(id, new JsfInputHiddenModel());
	}

}
