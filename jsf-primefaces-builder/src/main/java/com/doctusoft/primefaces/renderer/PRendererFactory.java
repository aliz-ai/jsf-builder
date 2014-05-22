package com.doctusoft.primefaces.renderer;

import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;
import com.doctusoft.jsf.render.JsfRendererFactory;
import com.doctusoft.jsf.render.Renderer;
import com.doctusoft.primefaces.comp.model.PCommandButtonModel;

public class PRendererFactory extends JsfRendererFactory {
	
	@Override
	public Renderer resolveRenderer(JsfBaseComponentModel model) {
		if (model instanceof PCommandButtonModel)
			return new PCommandButtonRenderer((PCommandButtonModel) model);
		return super.resolveRenderer(model);
	}

}
