package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlOutputText;

import com.doctusoft.jsf.comp.model.JsfOutputTextModel;

public class JsfOutputTextRenderer extends JsfOutputRenderer<HtmlOutputText, JsfOutputTextModel, String>  
{

	public JsfOutputTextRenderer(JsfOutputTextModel model) {
		super(new HtmlOutputText(), model, String.class);
	}
}
