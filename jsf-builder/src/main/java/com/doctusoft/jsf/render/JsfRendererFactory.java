package com.doctusoft.jsf.render;

import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;
import com.doctusoft.jsf.comp.model.JsfButtonModel;
import com.doctusoft.jsf.comp.model.JsfCheckboxModel;
import com.doctusoft.jsf.comp.model.JsfFormModel;
import com.doctusoft.jsf.comp.model.JsfInputTextModel;
import com.doctusoft.jsf.comp.model.JsfLabelModel;
import com.doctusoft.jsf.comp.model.JsfOutputTextModel;
import com.doctusoft.jsf.comp.model.JsfPanelGroupModel;
import com.doctusoft.jsf.comp.model.JsfSelectModel;
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
		if (model instanceof JsfPanelGroupModel)
			return new JsfPanelGroupRenderer((JsfPanelGroupModel) model);
		if (model instanceof JsfButtonModel)
			return new JsfButtonRenderer((JsfButtonModel) model);
		if (model instanceof JsfInputTextModel)
			return new JsfInputTextRenderer((JsfInputTextModel) model);
		if (model instanceof JsfCheckboxModel)
			return new JsfCheckboxRenderer((JsfCheckboxModel) model);
		if (model instanceof JsfTextareaModel)
			return new JsfTextareaRenderer((JsfTextareaModel) model);
		if (model instanceof JsfOutputTextModel)
			return new JsfOutputTextRenderer((JsfOutputTextModel) model);
		if (model instanceof JsfFormModel)
			return new JsfFormRenderer((JsfFormModel) model);
		if (model instanceof JsfSelectModel)
			return new JsfSelectOneMenuRenderer((JsfSelectModel) model);
		return null;
	}

	public class NoRendererFoundException extends RuntimeException {
		public NoRendererFoundException(JsfBaseComponentModel model) {
			super("No renderer found for model: " + model);
		}
	}
}
