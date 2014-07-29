package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.jsf.comp.model.JsfSelectOneRadioModel;
import com.doctusoft.jsf.comp.model.JsfSelectOneRadioModel.Layout;

public class JsfSelectOneRadio<Value> extends JsfSelectOne<Value, JsfSelectOneRadio<Value>, JsfSelectOneRadioModel> {

	public JsfSelectOneRadio(String id) {
		super(id, new JsfSelectOneRadioModel());
	}
	
	public JsfSelectOneRadio<Value> withLayout(Layout value) {
		model.setLayout(new ConstantValueBinding<String>(value.getDescription()));
		return this;
	}
}
