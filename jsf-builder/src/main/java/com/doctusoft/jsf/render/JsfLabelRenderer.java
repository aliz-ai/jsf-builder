package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlOutputLabel;

import com.doctusoft.jsf.comp.model.JsfLabelModel;

public class JsfLabelRenderer extends JsfBaseComponentRenderer<HtmlOutputLabel> {
	
	public JsfLabelRenderer(JsfLabelModel model) {
		super(new HtmlOutputLabel(), model);
		bind("value", model.getLabel());
	}

}
