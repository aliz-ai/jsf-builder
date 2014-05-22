package com.doctusoft.jsf.comp;

import java.util.List;
import java.util.Map;

import javax.faces.model.SelectItem;

import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfSelectModel;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class JsfSelectOneMenu<T> extends JsfAbstractInput<JsfSelectOneMenu<T>, String, JsfSelectModel> {
	
	private Map<T, JsfSelectItem<T>> itemsByObject = Maps.newHashMap();
	private Map<String, JsfSelectItem<T>> itemsByValue = Maps.newHashMap();

	public JsfSelectOneMenu(String id) {
		super(id, new JsfSelectModel());
	}
	
	/**
	 * This allow you to bind your domain objects instead of string represantions with converters
	 */
	public JsfSelectOneMenu<T> bindValue(final ValueBinding<T> valueBinding) {
		bind(new ValueBinding<String>() {
			@Override
			public String getValue() {
				T modelValue = valueBinding.getValue();
				JsfSelectItem<T> item = itemsByObject.get(modelValue);
				if (item == null)
					return null;
				return item.getId();
			}
			@Override
			public void setValue(String value) {
				JsfSelectItem<T> item = itemsByValue.get(value);
				if (item == null) {
					valueBinding.setValue(null);
				} else {
					valueBinding.setValue(item.getValue());
				}
			}
		});
		return this;
	}
	
	public JsfSelectOneMenu<T> withSelectItems(Iterable<JsfSelectItem<T>> selectItems) {
		itemsByObject.clear();
		itemsByValue.clear();
		List<SelectItem> resultItems = Lists.newArrayList();
		for (JsfSelectItem<T> item : selectItems) {
			itemsByObject.put(item.getValue(), item);
			itemsByValue.put(item.getId(), item);
			SelectItem resultItem = new SelectItem();
			resultItem.setValue(item.getId());
			resultItem.setLabel(item.getLabel());
			resultItems.add(resultItem);
		}
		model.setSelectItems(resultItems);
		return this;
	}


}
