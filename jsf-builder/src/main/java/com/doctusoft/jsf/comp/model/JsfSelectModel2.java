package com.doctusoft.jsf.comp.model;

import java.util.List;

import javax.faces.model.SelectItem;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JsfSelectModel2<Value> extends JsfInputModel<Value> {

	private Class<Value> valueClass;
	
	private List<SelectItem> selectItems;
	
	public JsfSelectModel2(Class<Value> valueClass) {
		super();
		this.valueClass = valueClass;
	}
}
