package com.doctusoft.jsf.render;

import java.util.List;

import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfRepeatModel;
import com.sun.faces.facelets.component.UIRepeat;


public class JsfRepeatRenderer extends JsfBaseComponentRenderer<UIRepeat> {
	
	public JsfRepeatRenderer(JsfRepeatModel model) {
		super(new UIRepeat(), model);
		component.setVar(model.getVar());
		component.setVarStatus(model.getVarStatus());
		bind("value", (ValueBinding) model.getItems(), List.class);
	}

}
