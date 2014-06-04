package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfPanelGroupModel;

public class JsfPanelGroup extends JsfBaseComponent<JsfPanelGroup, JsfPanelGroupModel> implements IsContainer<JsfPanelGroup> {
	
	public JsfPanelGroup(String id) {
		super(id, new JsfPanelGroupModel());
	}
	
	public JsfPanelGroup rendered(ValueBinding<Boolean> binding) {
		model.setRendered(binding);
		return this;
	}
	
	public JsfPanelGroup withRendered(boolean value) {
		return rendered(new ConstantValueBinding<Boolean>(value));
	}
}
