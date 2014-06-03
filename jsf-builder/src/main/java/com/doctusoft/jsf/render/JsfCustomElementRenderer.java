package com.doctusoft.jsf.render;

import com.doctusoft.jsf.comp.model.JsfCustomElementModel;
import com.doctusoft.jsf.custom.CustomElementComponent;

public class JsfCustomElementRenderer extends JsfBaseComponentRenderer<CustomElementComponent> {
	
	public JsfCustomElementRenderer(JsfCustomElementModel model) {
		super(CustomElementComponent.COMPONENT_TYPE, model);
		component.setElementName(model.getElementName());
		component.setId(model.getId());
		if (model.getStyleClass() != null)
			component.setStyleClass(model.getStyleClass().getValue());
		if (model.getStyle() != null)
			component.setStyle(model.getStyle().getValue());
	}

}
