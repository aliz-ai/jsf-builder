package com.doctusoft.jsf.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlPanelGroup;

import com.doctusoft.MethodRef;
import com.doctusoft.ObservableProperty;

@SessionScoped
@ManagedBean(name="TestBacking")
public class TestBacking {
	
	private HtmlPanelGroup view = null;
	
	@ObservableProperty
	private String message = "hello world";
	
	public HtmlPanelGroup getView() {
		if (view == null) {
			view = (HtmlPanelGroup) new TestView().getComponent();
		}
		return view;
	}
	
	public void setView(HtmlPanelGroup view) {
		// do nothing
	}

	@MethodRef
	public void testMethod() {
		setMessage("changed");
	}
	
}
