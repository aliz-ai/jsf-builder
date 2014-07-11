package com.doctusoft.jsf.comp;

import java.util.ArrayList;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;
import com.doctusoft.jsf.comp.model.JsfLinkModel;
import com.doctusoft.jsf.comp.model.JsfOutputTextModel;

public class JsfLink extends JsfBaseComponent<JsfLink, JsfLinkModel> {
	
	public JsfLink(String id) {
		super(id, new JsfLinkModel());
	}
	
	public JsfLink(String id, String caption) {
		this(id);
		withCaption(caption);
	}
	
	public JsfLink withCaption(String caption) {
		JsfOutputTextModel captionModel = new JsfOutputTextModel();
		captionModel.setValue(new ConstantValueBinding<String>(caption));
		model.setChildren(new ArrayList<JsfBaseComponentModel>());
		model.getChildren().add(captionModel);
		return this;
	}
	
	public JsfLink bindCaption(ValueBinding<String> caption) {
		JsfOutputTextModel captionModel = new JsfOutputTextModel();
		captionModel.setValue(caption);
		model.setChildren(new ArrayList<JsfBaseComponentModel>());
		model.getChildren().add(captionModel);
		return this;
	}
	
	public JsfLink withOutcome(String outcome) {
		model.setOutcome(new ConstantValueBinding<String>(outcome));
		return this;
	}
	
	public JsfLink bindOutcome(ValueBinding<String> outcome) {
		model.setOutcome(outcome);
		return this;
	}
}
