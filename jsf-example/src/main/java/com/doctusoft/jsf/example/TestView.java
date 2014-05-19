package com.doctusoft.jsf.example;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfLabel;

public class TestView extends AbstractBackingView<TestBacking> {
	
	public TestView() {
		super(TestBacking.class, "TestBacking");
		new JsfLabel().bind(bindOnPresenter().get(TestBacking_._message)).appendTo(container);
		new JsfButton("clickme").click(presenterMethod(TestBacking_.__testMethod)).appendTo(container);
	}

}
