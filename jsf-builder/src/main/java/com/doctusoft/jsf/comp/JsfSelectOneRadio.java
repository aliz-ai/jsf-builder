package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfSelectOneRadioModel;

public class JsfSelectOneRadio<Value> extends JsfSelectOne<Value, JsfSelectOneRadio<Value>> {

	public JsfSelectOneRadio(String id) {
		super(id, new JsfSelectOneRadioModel());
	}
}
