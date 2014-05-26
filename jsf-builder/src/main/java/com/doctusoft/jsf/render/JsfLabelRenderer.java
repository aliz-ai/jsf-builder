package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlOutputLabel;

import com.doctusoft.jsf.comp.model.JsfLabelModel;

public class JsfLabelRenderer extends JsfOutputRenderer<HtmlOutputLabel, JsfLabelModel, String>  {
	
	public JsfLabelRenderer(JsfLabelModel model) {
		super(new HtmlOutputLabel(), model, String.class);
		bind("value", model.getLabel());
	}

}
