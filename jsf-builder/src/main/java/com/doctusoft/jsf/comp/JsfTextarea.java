package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.jsf.comp.model.JsfTextareaModel;

public class JsfTextarea extends JsfAbstractInput<JsfTextarea, String, JsfTextareaModel> {

	public JsfTextarea() {
		super(new JsfTextareaModel());
	}
	
	public JsfTextarea withRows(int rows) {
		model.setRows(new ConstantValueBinding<Integer>(rows));
		return this;
	}
	
	public JsfTextarea withCols(int cols) {
		model.setCols(new ConstantValueBinding<Integer>(cols));
		return this;
	}

}
