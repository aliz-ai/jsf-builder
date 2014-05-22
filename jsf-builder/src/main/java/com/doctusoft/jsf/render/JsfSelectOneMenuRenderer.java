package com.doctusoft.jsf.render;

import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlSelectOneMenu;

import com.doctusoft.jsf.comp.model.JsfSelectModel;

public class JsfSelectOneMenuRenderer extends JsfInputRenderer<HtmlSelectOneMenu, JsfSelectModel, String> {
	
	public JsfSelectOneMenuRenderer(JsfSelectModel model) {
		super(new HtmlSelectOneMenu(), model, String.class);
		UISelectItems items = new UISelectItems();
		items.setValue(model.getSelectItems());
		component.getChildren().add(items);
	}

}
