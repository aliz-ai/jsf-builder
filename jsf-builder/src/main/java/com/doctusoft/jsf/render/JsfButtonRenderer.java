package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlCommandButton;

import com.doctusoft.jsf.comp.model.JsfButtonModel;

public class JsfButtonRenderer extends JsfBaseComponentRenderer<HtmlCommandButton> {
	
	public JsfButtonRenderer(JsfButtonModel model) {
		this(HtmlCommandButton.COMPONENT_TYPE, model);
	}

	public JsfButtonRenderer(String componentType, JsfButtonModel model) {
		super(componentType, model);
		bind("value", model.getCaption());
		bind("immediate", model.getImmediate(), Boolean.class);
		bindCommand(model.getAction());
	}
}
