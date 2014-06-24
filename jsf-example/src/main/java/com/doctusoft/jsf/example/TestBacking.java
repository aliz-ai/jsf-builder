package com.doctusoft.jsf.example;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.MethodRef;
import com.doctusoft.Property;
import com.doctusoft.jsf.comp.JsfSelectItem;
import com.doctusoft.jsf.example.model.CountryVO;
import com.doctusoft.jsf.example.model.DataHolder;
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
	public static List<JsfSelectItem<CountryVO>> countrySelectItems = SelectUtils.orszagSelectItems(CountryVO.countries());
	
	@Property
	private CountryVO country;

	@Property
	private PaymentType selectedPaymentType = PaymentType.Visa;

	@Property
	private String inputHidden1;
	
	@Property
	private String val22;

	@Property
	private String valpit;

	@MethodRef
	public void testMethod() {
		StringBuilder sb = new StringBuilder();
		if (selectedPaymentType != null)
			sb.append(" paymentType:" + selectedPaymentType.name());
		if (country != null)
			sb.append(" country:" + country.getName());
		setMessage(sb.toString());
	}

	@Property(readonly = true)
	public boolean isPGVisible() {
		return PaymentType.Paypal.equals(selectedPaymentType);
	}
	
	public enum PaymentType {
		Cash, MasterCard, Visa, Paypal
	}

}
