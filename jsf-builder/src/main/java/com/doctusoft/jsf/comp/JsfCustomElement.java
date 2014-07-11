package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfCustomElementModel;

public class JsfCustomElement extends JsfBaseComponent<JsfCustomElement, JsfCustomElementModel> {
	
	public JsfCustomElement(String elementName, String id) {
		super(id, new JsfCustomElementModel());
		model.setElementName(elementName);
	}

	public JsfCustomElement(String elementName) {
		this(elementName, null);
	}
	
	public JsfCustomElement withAttribute(String name, String value) {
		model.getAttributes().put(name, value);
		return this;
	}

	public <T> JsfCustomElement withAttribute(String name, ValueBinding<T> binding) {
		model.getAttributesWithBinding().put(name, binding);
		return this;
	}

	public JsfCustomElement withText(String text) {
		model.setText(text);
		return this;
	}
}
