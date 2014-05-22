package com.doctusoft.jsf;

import javax.faces.context.FacesContext;

/**
 * Creates a renderer factory using the "RendererFactory" init paramaeter of the faces servlet  
 */
public class RendererFactory {
	
	protected static AbstractRendererFactory rendererFactory = null;
	
	protected static AbstractRendererFactory resolveRendererFactory() {
		try {
			String rendererFactoryClass = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("RendererFactory");
			Object factory = Class.forName(rendererFactoryClass).newInstance();
			return (AbstractRendererFactory) factory;
		} catch (Exception e) {
			throw new RuntimeException("Could not resolve renderer factory. Did you forget to configure it in the web.xml?", e);
		}
		
	}
	
	public static synchronized AbstractRendererFactory get() {
		if (rendererFactory == null) {
			rendererFactory = resolveRendererFactory();
		}
		return rendererFactory;
	}

}
