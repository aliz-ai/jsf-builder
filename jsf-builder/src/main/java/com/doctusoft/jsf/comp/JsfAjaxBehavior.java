package com.doctusoft.jsf.comp;

import java.util.ArrayList;

import lombok.Getter;

import com.doctusoft.jsf.comp.model.IsNamingContainer;
import com.doctusoft.jsf.comp.model.IsRepeating;
import com.doctusoft.jsf.comp.model.JsfAjaxBehaviorModel;
import com.doctusoft.jsf.comp.model.JsfAjaxTarget;
import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;

public class JsfAjaxBehavior {
	
	@Getter
	private JsfAjaxBehaviorModel model = new JsfAjaxBehaviorModel();
	
	protected void ensureExecuteList() {
		if (model.getExecute() == null) {
			model.setExecute(new ArrayList<JsfAjaxTarget>());
		}
	}

	/**
	 * nb: automatic id resolution is only partially possible, see {@link #resolveIdPart(JsfBaseComponent)} 
	 */
	public JsfAjaxBehavior execute(JsfBaseComponent<?, ?> component) {
		ensureExecuteList();
		model.getExecute().add(new JsfAjaxTarget(component.getModel()));
		return this;
	}
	
	public JsfAjaxBehavior execute(String execute) {
		ensureExecuteList();
		model.getExecute().add(new JsfAjaxTarget(execute));
		return this;
	}
	
	/**
	 * nb: automatic id resolution is only partially possible, see {@link #resolveIdPart(JsfBaseComponent)} 
	 */
	public JsfAjaxBehavior render(JsfBaseComponent<?, ?> component) {
		ensureRenderList();
		model.getRender().add(new JsfAjaxTarget(component.getModel()));
		return this;
	}

	/**
	 * nb: a qualified id chain cannot be resolved through repeating components.
	 */
	public static String resolveIdPart(final JsfBaseComponentModel model) {
		String id = "";
		JsfBaseComponentModel item = model;
		while (item != null) {
			if (item.getRootIdChain() != null) {
				id = item.getRootIdChain();
				break;
			} else if (item instanceof IsNamingContainer) {
				if (item instanceof IsRepeating)
					throw new RuntimeException("Cannot resolve the qualified id of this component, because it's contained in a repeating container");
				id = ":" + item.getId() + id; 
			}
			item = item.getParent();
		}
		id += ":" + model.getId();
		return id;
	}
	
	public JsfAjaxBehavior render(String render) {
		ensureRenderList();
		model.getRender().add(new JsfAjaxTarget(render));
		return this;
	}

	protected void ensureRenderList() {
		if (model.getRender() == null) {
			model.setRender(new ArrayList<JsfAjaxTarget>());
		}
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
