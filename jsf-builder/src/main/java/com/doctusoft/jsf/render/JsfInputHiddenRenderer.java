package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlInputHidden;

import com.doctusoft.jsf.comp.model.JsfInputHiddenModel;

public class JsfInputHiddenRenderer extends JsfInputRenderer<HtmlInputHidden, JsfInputHiddenModel, String> {

	public JsfInputHiddenRenderer(JsfInputHiddenModel model) {
		super(HtmlInputHidden.COMPONENT_TYPE, model, String.class);
	}

}
