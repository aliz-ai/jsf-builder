package com.doctusoft.jsf.render;

import com.doctusoft.jsf.comp.model.JsfCustomElementModel;
import com.doctusoft.jsf.custom.CustomElementComponent;

public class JsfCustomElementRenderer extends JsfBaseComponentRenderer<CustomElementComponent> {
	
	public JsfCustomElementRenderer(JsfCustomElementModel model) {
		super(CustomElementComponent.COMPONENT_TYPE, model);
		component.setElementName(model.getElementName());
	}

}
