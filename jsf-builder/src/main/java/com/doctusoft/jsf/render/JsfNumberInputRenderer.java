package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlInputText;

import com.doctusoft.jsf.comp.model.JsfNumberInputModel;

public class JsfNumberInputRenderer extends JsfInputRenderer<HtmlInputText, JsfNumberInputModel, Integer> {

	public JsfNumberInputRenderer(JsfNumberInputModel model) {
		super(HtmlInputText.COMPONENT_TYPE, model, Integer.class);
	}
}
