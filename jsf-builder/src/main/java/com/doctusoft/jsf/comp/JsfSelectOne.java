package com.doctusoft.jsf.comp;

import java.util.List;
import java.util.Map;

import javax.faces.model.SelectItem;

import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfSelectModel;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public abstract class JsfSelectOne<Value, Actual extends JsfSelectOne<?,?>> extends JsfAbstractInput<Actual, String, JsfSelectModel> {

	private Map<Value, JsfSelectItem<Value>> itemsByObject = Maps.newHashMap();
	private Map<String, JsfSelectItem<Value>> itemsByValue = Maps.newHashMap();

	public JsfSelectOne(String id, JsfSelectModel model) {
		super(id, model);
	}

	/**
	 * This allows you to bind your domain objects instead of string represantions with converters
	 */
	public Actual bindValue(final ValueBinding<Value> valueBinding) {
		bind(new ValueBinding<String>() {
			@Override
			public String getValue() {
				Value modelValue = valueBinding.getValue();
				JsfSelectItem<Value> item = itemsByObject.get(modelValue);
				if (item == null)
					return null;
				return item.getId();
			}
			@Override
			public void setValue(String value) {
				JsfSelectItem<Value> item = itemsByValue.get(value);
				if (item == null) {
					valueBinding.setValue(null);
				} else {
					valueBinding.setValue(item.getValue());
				}
			}
		});
		return (Actual) this;
	}

	public Actual withSelectItems(Iterable<JsfSelectItem<Value>> selectItems) {
		itemsByObject.clear();
		itemsByValue.clear();
		List<SelectItem> resultItems = Lists.newArrayList();
		for (JsfSelectItem<Value> item : selectItems) {
			itemsByObject.put(item.getValue(), item);
			itemsByValue.put(item.getId(), item);
			SelectItem resultItem = new SelectItem();
			resultItem.setValue(item.getId());
			resultItem.setLabel(item.getLabel());
			resultItems.add(resultItem);
		}
		model.setSelectItems(resultItems);
		return (Actual) this;
	}

}