package com.doctusoft.jsf.render;

import javax.faces.component.UISelectItems;
import javax.faces.component.UISelectOne;

import com.doctusoft.jsf.comp.model.JsfSelectModel;

public class JsfSelectOneRenderer<Component extends UISelectOne, Model extends JsfSelectModel> extends JsfInputRenderer<Component, Model, String> {

	public JsfSelectOneRenderer(String componentType, Model model) {
		super(componentType, model, String.class);
		UISelectItems items = new UISelectItems();
		items.setValue(model.getSelectItems());
		component.getChildren().add(items);
	}

}