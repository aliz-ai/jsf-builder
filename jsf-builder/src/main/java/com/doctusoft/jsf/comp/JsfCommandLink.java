package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.EmptyEventHandler;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfCommandLinkModel;

public class JsfCommandLink extends JsfBaseComponent<JsfCommandLink, JsfCommandLinkModel> {

	public JsfCommandLink(String id) {
		super(id, new JsfCommandLinkModel());
	}

	public JsfCommandLink(String id, String caption) {
		this(id);
		withCaption(caption);
	}

	public JsfCommandLink bindCaption(ValueBinding<String> caption) {
		model.setCaption(caption);
		return this;
	}

	public JsfCommandLink withCaption(String caption) {
		model.setCaption(new ConstantValueBinding<String>(caption));
		return this;
	}

	public JsfCommandLink action(EmptyEventHandler handler) {
		model.setAction(handler);
		return this;
	}

	public JsfCommandLink immediate() {
		model.setImmediate(new ConstantValueBinding<Boolean>(true));
		return this;
	}
}
