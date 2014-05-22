package com.doctusoft.jsf;

import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;
import com.doctusoft.jsf.render.Renderer;

public abstract class AbstractRendererFactory {
	
	public Renderer getRenderer(JsfBaseComponentModel model) {
		Renderer renderer = resolveRenderer(model);
		if (renderer == null)
			throw new NoRendererFoundException(model);
		return renderer;
	}

	public class NoRendererFoundException extends RuntimeException {
		public NoRendererFoundException(JsfBaseComponentModel model) {
			super("No renderer found for model: " + model);
		}
	}
	
	public abstract Renderer resolveRenderer(JsfBaseComponentModel model);
}
