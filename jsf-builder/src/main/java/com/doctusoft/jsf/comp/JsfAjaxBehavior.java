package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.HasComponentModel;
import com.doctusoft.jsf.comp.model.JsfAjaxBehaviorModel;

public class JsfAjaxBehavior {
	
	private JsfAjaxBehaviorModel model = new JsfAjaxBehaviorModel();
	
	public JsfAjaxBehavior execute(String execute) {
		model.setExecute(execute);
		return this;
	}
	
	public JsfAjaxBehavior render(String render) {
		model.setRender(render);
		return this;
	}
	
	public JsfAjaxBehavior applyOn(HasComponentModel component) {
		component.getModel().setAjaxModel(model);
		return this;
	}

}
