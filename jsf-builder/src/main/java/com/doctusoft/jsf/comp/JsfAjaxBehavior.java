package com.doctusoft.jsf.comp;

import java.util.ArrayList;

import lombok.Getter;

import com.doctusoft.jsf.comp.model.IsNamingContainer;
import com.doctusoft.jsf.comp.model.IsRepeating;
import com.doctusoft.jsf.comp.model.JsfAjaxBehaviorModel;
import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;

public class JsfAjaxBehavior {
	
	@Getter
	private JsfAjaxBehaviorModel model = new JsfAjaxBehaviorModel();

	/**
	 * nb: automatic id resolution is only partially possible, see {@link #resolveIdPart(JsfBaseComponent)} 
	 */
	public JsfAjaxBehavior execute(JsfBaseComponent<?, ?> component) {
		return execute(resolveIdPart(component));
	}
	
	public JsfAjaxBehavior execute(String execute) {
		if (model.getExecute() == null) {
			model.setExecute(new ArrayList<String>());
		}
		model.getExecute().add(execute);
		return this;
	}
	
	/**
	 * nb: automatic id resolution is only partially possible, see {@link #resolveIdPart(JsfBaseComponent)} 
	 */
	public JsfAjaxBehavior render(JsfBaseComponent<?, ?> component) {
		return render(resolveIdPart(component));
	}

	/**
	 * nb: a qualified id chain cannot be resolved through repeating components.
	 */
	public String resolveIdPart(JsfBaseComponent<?, ?> component) {
		String id = "";
		JsfBaseComponentModel model = component.getModel();
		while (model != null) {
			if (model.getRootIdChain() != null) {
				id = model.getRootIdChain();
				break;
			} else if (model instanceof IsNamingContainer) {
				if (model instanceof IsRepeating)
					throw new RuntimeException("Cannot resolve the qualified id of this component, because it's contained in a repeating container");
				id = ":" + model.getId() + id; 
			}
			model = model.getParent();
		}
		id += ":" + component.getModel().getId();
		return id;
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
