package com.doctusoft.jsf.comp;

import java.util.List;

import javax.faces.model.SelectItem;

import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfSelectModel2;
import com.google.common.collect.Lists;

public abstract class JsfSelectOne2<Actual extends JsfSelectOne2<?,Model, Value>, Model extends JsfSelectModel2<Value>, Value> extends JsfAbstractInput<Actual, Value, Model> {

	public JsfSelectOne2(String id, Model model) {
		super(id, model);
	}

	/**
	 * This allow you to bind your domain objects instead of string representions with converters
	 */
	public Actual bindValue(final ValueBinding<Value> valueBinding) {
		bind(valueBinding);
		return (Actual) this;
	}

	public Actual withSelectItems(Iterable<JsfSelectItem<Value>> selectItems) {
		List<SelectItem> resultItems = Lists.newArrayList();
		for (JsfSelectItem<Value> item : selectItems) {
			SelectItem resultItem = new SelectItem();
			resultItem.setValue(item.getValue());
			resultItem.setLabel(item.getLabel());
			resultItems.add(resultItem);
		}
		model.setSelectItems(resultItems);
		return (Actual) this;
	}

}
