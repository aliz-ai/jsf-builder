package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfSelectOneMenuModel2;

public class JsfSelectOneMenu2<Value> extends JsfSelectOne2<JsfSelectOneMenu2<Value>, JsfSelectOneMenuModel2<Value>, Value> {

	public JsfSelectOneMenu2(String id, Class<Value> valueClass) {
		super(id, new JsfSelectOneMenuModel2<Value>(valueClass));
	}

}
