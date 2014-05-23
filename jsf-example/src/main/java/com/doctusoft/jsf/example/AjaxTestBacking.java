package com.doctusoft.jsf.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlPanelGroup;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.MethodRef;
import com.doctusoft.Property;

@SessionScoped
@ManagedBean(name="AjaxTestBacking")
@Getter @Setter
public class AjaxTestBacking {

	private HtmlPanelGroup view = null;

	@Property
	private String inputValue;
	
	@Property
	private String message;
	
	@Property
	private String selectedValue;

	public HtmlPanelGroup getView() {
		if (view == null) {
			view = (HtmlPanelGroup) new AjaxTestView().getComponent();
		}
		return view;
	}
	
	public void setView(HtmlPanelGroup view) {
		// do nothing
	}

	
	@MethodRef
	public void testMethod() {
		setMessage("you entered: " + inputValue);
	}
}
