package com.doctusoft.jsf.example;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfCheckbox;
import com.doctusoft.jsf.comp.JsfInputText;
import com.doctusoft.jsf.comp.JsfLabel;
import com.doctusoft.jsf.comp.JsfTextarea;

public class TestView extends AbstractBackingView<TestBacking> {
	
	private JsfLabel messageLabel;
	private JsfButton testButton;

	public TestView() {
		super(TestBacking.class, "TestBacking");
		new JsfLabel("Component showcase").withStyleClasses("heading").appendTo(container);
		new JsfInputText().bind(bindOnPresenter().get(TestBacking_._input)).appendTo(container);
		messageLabel = new JsfLabel().bind(bindOnPresenter().get(TestBacking_._message))
			.onclick("window.alert('hehe')").appendTo(container);
		testButton = new JsfButton("clickme").action(presenterMethod(TestBacking_.__testMethod)).appendTo(container);
		new JsfCheckbox().appendTo(container);
		new JsfTextarea().appendTo(container);
	}

}
