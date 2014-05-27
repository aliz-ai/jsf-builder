package com.doctusoft.jsf.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfAjaxBehavior;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfCustomElement;
import com.doctusoft.jsf.comp.JsfForm;
import com.doctusoft.jsf.comp.JsfInputText;
import com.doctusoft.jsf.comp.JsfOutputText;
import com.doctusoft.jsf.comp.JsfRepeat;

@ViewScoped
@ManagedBean(name="RepeatView")
public class RepeatView extends AbstractBackingView<RepeatBacking> {
	
	public RepeatView() {
		super(RepeatBacking.class, "RepeatBacking", "repeat");
		JsfForm form = new JsfForm("form").appendTo(container);
		JsfCustomElement ul = new JsfCustomElement("ul").appendTo(form);
		JsfRepeat<PersonListItem> repeat = new JsfRepeat<PersonListItem>("personList", PersonListItem.class)
			.bind(bindOnPresenter().get(RepeatBacking_._items))
			.withVar("person").appendTo(ul);
		JsfCustomElement li = new JsfCustomElement("li").appendTo(repeat);
		new JsfOutputText("personName").bind(repeat.bindOnItem().get(PersonListItem_._name))
				.bindRendered(repeat.bindOnItem().get(PersonListItem_._viewMode))
				.appendTo(li);
		new JsfInputText("personNameEdit").bind(repeat.bindOnItem().get(PersonListItem_._name))
				.bindRendered(repeat.bindOnItem().get(PersonListItem_._editMode))
				.appendTo(li);
		new JsfButton("editButton", "Edit")
			.action(repeat.itemMethod(this, RepeatBacking_.__switchToEditMode))
			.bindRendered(repeat.bindOnItem().get(PersonListItem_._viewMode))
			.withAjax(new JsfAjaxBehavior())
			.appendTo(li);
		new JsfButton("saveButton", "Save")
			.action(repeat.itemMethod(this, RepeatBacking_.__saveItemChanges))
			.bindRendered(repeat.bindOnItem().get(PersonListItem_._editMode))
			.withAjax(new JsfAjaxBehavior())
			.appendTo(li);
	}

}
