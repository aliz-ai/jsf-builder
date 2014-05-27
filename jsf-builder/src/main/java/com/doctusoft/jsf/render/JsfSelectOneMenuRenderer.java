package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlSelectOneMenu;

import com.doctusoft.jsf.comp.model.JsfSelectOneMenuModel;

public class JsfSelectOneMenuRenderer extends JsfSelectOneRenderer<HtmlSelectOneMenu, JsfSelectOneMenuModel> {
	
	public JsfSelectOneMenuRenderer(JsfSelectOneMenuModel model) {
		super(HtmlSelectOneMenu.COMPONENT_TYPE, model);
	}

}
