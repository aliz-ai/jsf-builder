package com.doctusoft.jsf.render;

import javax.faces.component.UISelectItems;
import javax.faces.component.UISelectOne;

import com.doctusoft.jsf.comp.model.JsfSelectModel2;

public class JsfSelectOneRenderer2<Component extends UISelectOne, Model extends JsfSelectModel2<Value>, Value> extends JsfInputRenderer<Component, Model, Value> {

	public JsfSelectOneRenderer2(String componentType, Model model, Class<Value> valueClass) {
		super(componentType, model, valueClass);
		UISelectItems items = new UISelectItems();
		items.setValue(model.getSelectItems());
		component.getChildren().add(items);
	}

}
