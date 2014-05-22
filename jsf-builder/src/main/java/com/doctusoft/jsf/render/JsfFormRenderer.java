package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlForm;

import com.doctusoft.jsf.comp.model.JsfFormModel;

public class JsfFormRenderer extends JsfBaseRenderer<HtmlForm> {
	
	public JsfFormRenderer(JsfFormModel model) {
		super(new HtmlForm(), model);
		component.setEnctype(model.getEntype());
	}

}
