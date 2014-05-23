package com.doctusoft.jsf.example;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlPanelGroup;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.MethodRef;
import com.doctusoft.Property;
import com.google.common.collect.Lists;

@SessionScoped
@ManagedBean(name="RepeatBacking")
@Getter @Setter
public class RepeatBacking {

	private HtmlPanelGroup view = null;
	
	@Property
	private List<PersonListItem> items = Lists.newArrayList();
	
	public HtmlPanelGroup getView() {
		if (view == null) {
			view = (HtmlPanelGroup) new RepeatView().getComponent();
		}
		return view;
	}
	
	public void setView(HtmlPanelGroup view) {
		// do nothing
	}

	public RepeatBacking() {
		items.add(new PersonListItem("John Doe"));
		items.add(new PersonListItem("Jack Sparrow"));
	}

	@MethodRef
	public void switchToEditMode(PersonListItem item) {
		item.setViewMode(false);
	}

	@MethodRef
	public void saveItemChanges(PersonListItem item) {
		item.setViewMode(true);
	}
}
