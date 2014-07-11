package com.doctusoft.jsf.comp;

import javax.faces.convert.IntegerConverter;

import com.doctusoft.jsf.comp.model.JsfNumberInputModel;

public class JsfNumberInput extends JsfAbstractInput<JsfNumberInput, Integer, JsfNumberInputModel> {

	public JsfNumberInput(String id) {
		super(id, new JsfNumberInputModel());
		model.setConverter(new IntegerConverter());
	}
	
}
