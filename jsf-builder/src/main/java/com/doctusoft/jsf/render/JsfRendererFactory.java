package com.doctusoft.jsf.render;

import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;
import com.doctusoft.jsf.comp.model.JsfButtonModel;
import com.doctusoft.jsf.comp.model.JsfCheckboxModel;
import com.doctusoft.jsf.comp.model.JsfContainerModel;
import com.doctusoft.jsf.comp.model.JsfInputTextModel;
import com.doctusoft.jsf.comp.model.JsfLabelModel;
import com.doctusoft.jsf.comp.model.JsfTextareaModel;

public class JsfRendererFactory {
	
	public Renderer getRenderer(JsfBaseComponentModel model) {
		Renderer renderer = resolveRenderer(model);
		if (renderer == null)
			throw new NoRendererFoundException(model);
		return renderer;
	}
	
	public Renderer resolveRenderer(JsfBaseComponentModel model) {
		if (model instanceof JsfLabelModel)
			return new JsfLabelRenderer((JsfLabelModel) model);
		if (model instanceof JsfContainerModel)
			return new JsfContainerRenderer((JsfContainerModel) model);
		if (model instanceof JsfButtonModel)
			return new JsfButtonRenderer((JsfButtonModel) model);
		if (model instanceof JsfInputTextModel)
			return new JsfInputTextRenderer((JsfInputTextModel) model);
		if (model instanceof JsfCheckboxModel)
			return new JsfCheckboxRenderer((JsfCheckboxModel) model);
		if (model instanceof JsfTextareaModel)
			return new JsfTextareaRenderer((JsfTextareaModel) model);
		return null;
	}

	public class NoRendererFoundException extends RuntimeException {
		public NoRendererFoundException(JsfBaseComponentModel model) {
			super("No renderer found for model: " + model);
		}
	}
}
