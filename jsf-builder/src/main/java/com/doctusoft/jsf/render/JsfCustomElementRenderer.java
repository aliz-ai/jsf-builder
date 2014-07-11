package com.doctusoft.jsf.render;

import com.doctusoft.jsf.comp.model.JsfCustomElementModel;
import com.doctusoft.jsf.custom.CustomElementComponent;

public class JsfCustomElementRenderer extends JsfBaseComponentRenderer<CustomElementComponent> {
	
	public JsfCustomElementRenderer(JsfCustomElementModel model) {
		super(CustomElementComponent.COMPONENT_TYPE, model);
		component.setElementName(model.getElementName());
		component.setText(model.getText());
		if (model.getStyleClass() != null)
			component.setStyleClass(model.getStyleClass().getValue());
		if (model.getStyle() != null)
			component.setStyle(model.getStyle().getValue());
		for (String name : model.getAttributes().keySet()) 
			component.getAdditionalAttributes().put(name, model.getAttributes().get(name));
		for(String name : model.getAttributesWithBinding().keySet() ) {
			component.getAdditionalAttributesWithBinding().put(name, model.getAttributesWithBinding().get(name));
		}
	}

}
