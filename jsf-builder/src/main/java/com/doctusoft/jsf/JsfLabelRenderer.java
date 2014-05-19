package com.doctusoft.jsf;

import javax.faces.component.html.HtmlOutputLabel;

import com.doctusoft.jsf.comp.model.JsfLabelModel;

public class JsfLabelRenderer extends BaseJsfRenderer<HtmlOutputLabel> {
	
	public JsfLabelRenderer(JsfLabelModel model) {
		super(new HtmlOutputLabel(), model);
		bind("value", model.getLabel());
	}

}
