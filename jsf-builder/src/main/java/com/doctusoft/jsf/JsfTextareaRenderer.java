package com.doctusoft.jsf;

import javax.faces.component.html.HtmlInputTextarea;

import com.doctusoft.jsf.comp.model.JsfTextareaModel;

public class JsfTextareaRenderer extends JsfInputRenderer<HtmlInputTextarea, JsfTextareaModel, String> {

	public JsfTextareaRenderer(JsfTextareaModel model) {
		super(new HtmlInputTextarea(), model, String.class);
		bind("rows", model.getRows(), Integer.class);
		bind("cols", model.getCols(), Integer.class);
	}
}
