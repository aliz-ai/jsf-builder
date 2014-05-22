package com.doctusoft.jsf.example;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfCheckbox;
import com.doctusoft.jsf.comp.JsfForm;
import com.doctusoft.jsf.comp.JsfInputText;
import com.doctusoft.jsf.comp.JsfLabel;
import com.doctusoft.jsf.comp.JsfTextarea;

public class TestView extends AbstractBackingView<TestBacking> {
	
	private JsfLabel messageLabel;
	private JsfButton testButton;
	private JsfForm form;

	public TestView() {
		super(TestBacking.class, "TestBacking");
		form = new JsfForm("mainform").appendTo(container);
		new JsfLabel("headerLabel", "Component showcase").withStyleClasses("heading").appendTo(form);
		new JsfInputText("messageInput").bind(bindOnPresenter().get(TestBacking_._input)).appendTo(form);
		messageLabel = new JsfLabel("messageLabel").bind(bindOnPresenter().get(TestBacking_._message)).appendTo(form);
		testButton = new JsfButton("mainButton", "clickme").action(presenterMethod(TestBacking_.__testMethod)).appendTo(form);
		new JsfCheckbox("testCheckbox").appendTo(form);
		new JsfTextarea("testTextarea").appendTo(form);
	}

}
