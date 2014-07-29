package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfSelectOneMenuModel;

public class JsfSelectOneMenu<Value> extends JsfSelectOne<Value, JsfSelectOneMenu<Value>, JsfSelectOneMenuModel> {
	
	public JsfSelectOneMenu(String id) {
		super(id, new JsfSelectOneMenuModel());
	}


}
