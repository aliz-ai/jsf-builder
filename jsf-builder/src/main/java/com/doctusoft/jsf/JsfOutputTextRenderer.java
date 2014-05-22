package com.doctusoft.jsf;

import javax.faces.component.html.HtmlOutputText;

import com.doctusoft.jsf.comp.model.JsfOutputTextModel;

public class JsfOutputTextRenderer extends JsfBaseRenderer<HtmlOutputText> {

	public JsfOutputTextRenderer(JsfOutputTextModel model) {
		super(new HtmlOutputText(), model);
		bind("value", model.getValue());
	}
}
