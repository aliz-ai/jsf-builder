package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlForm;

import com.doctusoft.jsf.comp.model.JsfFormModel;

public class JsfFormRenderer extends JsfBaseComponentRenderer<HtmlForm> {
	
	public JsfFormRenderer(JsfFormModel model) {
		super(HtmlForm.COMPONENT_TYPE, model);
		component.setEnctype(model.getEntype());
	}

}
