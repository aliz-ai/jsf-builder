package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.EmptyEventHandler;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfButtonModel;

public abstract class JsfAbstractButton<Actual, Model extends JsfButtonModel> extends JsfBaseComponent<Actual, Model> {
	
	public JsfAbstractButton(String id, Model model) {
		super(id, model);
	}

	public Actual bindCaption(ValueBinding<String> caption) {
		model.setCaption(caption);
		return (Actual) this;
	}
	
	public Actual withCaption(String caption) {
		model.setCaption(new ConstantValueBinding<String>(caption));
		return (Actual) this;
	}
	
	public Actual action(EmptyEventHandler handler) {
		model.setAction(handler);
		return (Actual) this;
	}
	
	public Actual immediate() {
		model.setImmediate(new ConstantValueBinding<Boolean>(true));
		return (Actual) this;
	}

}
