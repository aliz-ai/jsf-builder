package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlSelectOneMenu;

import com.doctusoft.jsf.comp.model.JsfSelectOneMenuModel2;

public class JsfSelectOneMenuRenderer2<Value> extends JsfSelectOneRenderer2<HtmlSelectOneMenu, JsfSelectOneMenuModel2<Value>, Value> {

	public JsfSelectOneMenuRenderer2(JsfSelectOneMenuModel2<Value> model) {
		super(HtmlSelectOneMenu.COMPONENT_TYPE, model,  model.getValueClass());  
	}

}
