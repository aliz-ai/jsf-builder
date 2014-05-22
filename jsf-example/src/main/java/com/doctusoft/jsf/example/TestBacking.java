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
import com.google.common.collect.Lists;

@SessionScoped
@ManagedBean(name="TestBacking")
@Getter @Setter
public class TestBacking {
	
	private HtmlPanelGroup view = null;
	
	@Property
	private String message = "hello world";
	
	@Property
	private String input = "";
	
	public static List<JsfSelectItem<PaymentType>> paymentTypeSelectItems = enumSelectItems(PaymentType.values());
	
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

	public static <EnumType extends Enum<EnumType>> List<JsfSelectItem<EnumType>> enumSelectItems(EnumType [] values) {
		List<JsfSelectItem<EnumType>> items = Lists.newArrayList();
		for (EnumType value : values) {
			JsfSelectItem<EnumType> item = new JsfSelectItem<EnumType>();
			String name = value.name();
			item.setLabel(name);
			item.setValue(value);
			item.setId(name);
			items.add(item);
		}
		return items;
	}
}
