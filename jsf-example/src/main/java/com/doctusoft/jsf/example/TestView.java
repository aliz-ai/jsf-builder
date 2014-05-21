package com.doctusoft.jsf.example;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfCheckbox;
import com.doctusoft.jsf.comp.JsfLabel;

public class TestView extends AbstractBackingView<TestBacking> {
	
	private JsfLabel messageLabel;
	private JsfButton testButton;

	public TestView() {
		super(TestBacking.class, "TestBacking");
		messageLabel = new JsfLabel().bind(bindOnPresenter().get(TestBacking_._message))
			.onclick("window.alert('hehe')").appendTo(container);
		testButton = new JsfButton("clickme").action(presenterMethod(TestBacking_.__testMethod)).appendTo(container);
//		JsfCheckbox xxx = new JsfCheckbox().bind(null).withReadonly(false).withRequiredMessage("").get();
	}

}
