package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlSelectOneRadio;

import com.doctusoft.jsf.comp.model.JsfSelectOneRadioModel2;

public class JsfSelectOneRadioRenderer2<Value> extends JsfSelectOneRenderer2<HtmlSelectOneRadio, JsfSelectOneRadioModel2<Value>, Value> {

	public JsfSelectOneRadioRenderer2(JsfSelectOneRadioModel2<Value> model) {
		super(HtmlSelectOneRadio.COMPONENT_TYPE, model,  model.getValueClass());  
	}
}
