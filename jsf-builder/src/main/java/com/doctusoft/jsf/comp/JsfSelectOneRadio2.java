package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfSelectOneRadioModel2;


public class JsfSelectOneRadio2<Value> extends JsfSelectOne2<JsfSelectOneRadio2<Value>, JsfSelectOneRadioModel2<Value>, Value> {

	public JsfSelectOneRadio2(String id, Class<Value> valueClass) {
		super(id, new JsfSelectOneRadioModel2<Value>(valueClass));
	}
	
}


