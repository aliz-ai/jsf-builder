package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlCommandButton;

import com.doctusoft.jsf.comp.model.JsfButtonModel;

public class JsfButtonRenderer extends JsfBaseRenderer<HtmlCommandButton> {
	
	public JsfButtonRenderer(JsfButtonModel model) {
		this(new HtmlCommandButton(), model);
	}

	public JsfButtonRenderer(HtmlCommandButton component, JsfButtonModel model) {
		super(component, model);
		bind("value", model.getCaption());
		bindCommand(model.getAction());
	}
}
