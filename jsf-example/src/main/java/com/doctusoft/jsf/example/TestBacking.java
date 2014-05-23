package com.doctusoft.jsf.example;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlPanelGroup;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.MethodRef;
import com.doctusoft.Property;
import com.doctusoft.jsf.comp.JsfSelectItem;
import com.doctusoft.jsf.example.util.SelectUtils;

@SessionScoped
@ManagedBean(name="TestBacking")
@Getter @Setter
public class TestBacking {
	
	private HtmlPanelGroup view = null;
	
	@Property
	private String message = "hello world";
	
	@Property
	private String input = "";
	
	public static List<JsfSelectItem<PaymentType>> paymentTypeSelectItems = SelectUtils.enumSelectItems(PaymentType.values());
	
	@Property
	private PaymentType selectedPaymentType;
	
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
		setMessage("selected payment type: " + selectedPaymentType);
	}

	public enum PaymentType {
		Cash, MasterCard, Visa, Paypal
	}

}
