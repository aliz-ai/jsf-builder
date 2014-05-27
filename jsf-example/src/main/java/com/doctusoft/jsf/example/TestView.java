package com.doctusoft.jsf.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfCheckbox;
import com.doctusoft.jsf.comp.JsfForm;
import com.doctusoft.jsf.comp.JsfInputHidden;
import com.doctusoft.jsf.comp.JsfInputText;
import com.doctusoft.jsf.comp.JsfLabel;
import com.doctusoft.jsf.comp.JsfSelectOneMenu;
import com.doctusoft.jsf.comp.JsfSelectOneRadio;
import com.doctusoft.jsf.comp.JsfTextarea;
import com.doctusoft.jsf.example.TestBacking.PaymentType;

@ViewScoped
@ManagedBean(name="TestView")
public class TestView extends AbstractBackingView<TestBacking> {
	
	private JsfLabel messageLabel;
	private JsfButton testButton;
	private JsfForm form;

	public TestView() {
		super(TestBacking.class, "TestBacking", "test");
		form = new JsfForm("mainform").appendTo(container);
		new JsfLabel("headerLabel", "Component showcase").withStyleClasses("heading").appendTo(form);
		new JsfInputText("messageInput").bind(bindOnPresenter().get(TestBacking_._input)).appendTo(form);
		messageLabel = new JsfLabel("messageLabel").bind(bindOnPresenter().get(TestBacking_._message)).appendTo(form);
		testButton = new JsfButton("mainButton", "clickme").action(presenterMethod(TestBacking_.__testMethod)).appendTo(form);
		new JsfCheckbox("testCheckbox").appendTo(form);
		new JsfTextarea("testTextarea").appendTo(form);
		
		new JsfSelectOneMenu<PaymentType>("paymentTypeSelect")
			.bindValue(bindOnPresenter().get(TestBacking_._selectedPaymentType))
			.withSelectItems(TestBacking.paymentTypeSelectItems).appendTo(form);
		
		new JsfSelectOneRadio<PaymentType>("paymentTypeRadioSelect")
		.bindValue(bindOnPresenter().get(TestBacking_._selectedPaymentType2))
		.withSelectItems(TestBacking.paymentTypeSelectItems).appendTo(form);
		
		new JsfInputHidden("inputHidden1").bind(bindOnPresenter().get(TestBacking_._inputHidden1)).withValue("300").appendTo(form);
	}

}
