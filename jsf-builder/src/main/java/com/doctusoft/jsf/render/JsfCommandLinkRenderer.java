package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlCommandLink;

import com.doctusoft.jsf.comp.model.JsfCommandLinkModel;

public class JsfCommandLinkRenderer extends JsfBaseComponentRenderer<HtmlCommandLink> {

	public JsfCommandLinkRenderer(JsfCommandLinkModel model) {
		this(HtmlCommandLink.COMPONENT_TYPE, model);
	}

	public JsfCommandLinkRenderer(String componentType, JsfCommandLinkModel model) {
		super(componentType, model);
		bind("value", model.getCaption());
		bind("immediate", model.getImmediate(), Boolean.class);
		bindCommand(model.getAction());
	}

}
