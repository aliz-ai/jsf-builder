package com.doctusoft.jsf.comp;

import java.util.ArrayList;

import lombok.Getter;

import com.doctusoft.jsf.comp.model.JsfAjaxBehaviorModel;

public class JsfAjaxBehavior {
	
	@Getter
	private JsfAjaxBehaviorModel model = new JsfAjaxBehaviorModel();
	
	public JsfAjaxBehavior execute(String execute) {
		if (model.getExecute() == null) {
			model.setExecute(new ArrayList<String>());
		}
		model.getExecute().add(execute);
		return this;
	}
	
	public JsfAjaxBehavior render(String render) {
		if (model.getRender() == null) {
			model.setRender(new ArrayList<String>());
		}
		model.getRender().add(render);
		return this;
	}
	
	public JsfAjaxBehavior withEvent(String event) {
		model.setEvent(event);
		return this;
	}
	
	public JsfAjaxBehavior applyOn(JsfBaseComponent<?, ?> component) {
		component.withAjax(this);
		return this;
	}

}
