package com.doctusoft.jsf.example;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
	
	@Property
	private String message = "hello world";
	
	@Property
	private String input = "";
	
	private DataHolder dataHolder = new DataHolder();
	
	public static List<JsfSelectItem<PaymentType>> paymentTypeSelectItems = SelectUtils.enumSelectItems(PaymentType.values());
	
	@Property
	private PaymentType selectedPaymentType;

	@Property
	private PaymentType selectedPaymentType2;
	
	@Property
	private String inputHidden1;
	
	@Property
	private String val22;
	
	@MethodRef
	public void testMethod() {
		setMessage("selected payment type1: " + selectedPaymentType + ", selected payment type2: " + selectedPaymentType2);
	}

	public enum PaymentType {
		Cash, MasterCard, Visa, Paypal
	}

}
