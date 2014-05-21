package com.doctusoft.jsf;

import javax.faces.component.html.HtmlInputText;

import com.doctusoft.jsf.comp.model.JsfInputTextModel;

public class JsfInputTextRenderer extends JsfUIInputRenderer<HtmlInputText, JsfInputTextModel, String> {

	public JsfInputTextRenderer(JsfInputTextModel model) {
		super(new HtmlInputText(), model, String.class);
		bind("maxlength", model.getMaxLength(), Integer.class);
	}
}
