package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlInputText;

import com.doctusoft.jsf.comp.model.JsfInputTextModel;

public class JsfInputTextRenderer extends JsfInputRenderer<HtmlInputText, JsfInputTextModel, String> {

	public JsfInputTextRenderer(JsfInputTextModel model) {
		super(HtmlInputText.COMPONENT_TYPE, model, String.class);
		bind("maxlength", model.getMaxLength(), Integer.class);
	}
}
