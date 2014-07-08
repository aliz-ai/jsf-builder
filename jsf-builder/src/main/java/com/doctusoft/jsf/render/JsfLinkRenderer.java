package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlOutputLink;

import com.doctusoft.jsf.comp.model.JsfLinkModel;

public class JsfLinkRenderer extends JsfBaseComponentRenderer<HtmlOutputLink> {
	
	public JsfLinkRenderer(JsfLinkModel model) {
		this(HtmlOutputLink.COMPONENT_TYPE, model);
	}

	public JsfLinkRenderer(String componentType, JsfLinkModel model) {
		super(componentType, model);
		bind("value", model.getOutcome());
	}

}
