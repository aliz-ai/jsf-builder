package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.EmptyEventHandler;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfButtonModel;

public class JsfButton extends JsfBaseComponent<JsfButton, JsfButtonModel> {
	
	public JsfButton() {
		super(new JsfButtonModel());
	}
	
	public JsfButton(String caption) {
		this();
		withCaption(caption);
	}
	
	public JsfButton bindCaption(ValueBinding<String> caption) {
		model.setCaption(caption);
		return this;
	}
	
	public JsfButton withCaption(String caption) {
		model.setCaption(new ConstantValueBinding<String>(caption));
		return this;
	}
	
	public JsfButton click(EmptyEventHandler handler) {
		model.setAction(handler);
		return this;
	}

}
