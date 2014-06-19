package com.doctusoft.jsf.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfCheckbox;
import com.doctusoft.jsf.comp.JsfCustomElement;
import com.doctusoft.jsf.comp.JsfForm;
import com.doctusoft.jsf.comp.JsfInputText;
import com.doctusoft.jsf.comp.JsfLabel;
import com.doctusoft.jsf.comp.JsfPanelGroup;
import com.doctusoft.jsf.comp.JsfSelectOneMenu2;
import com.doctusoft.jsf.comp.JsfTextarea;
import com.doctusoft.jsf.example.TestBacking.PaymentType;
import com.doctusoft.jsf.example.model.OrszagVO;
import com.doctusoft.jsf.example.util.OrszagVOConverter;

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
		
//		new JsfSelectOneMenu<PaymentType>("paymentTypeSelect")
//			.bindValue(bindOnPresenter().get(TestBacking_._selectedPaymentType))
//			.withSelectItems(TestBacking.paymentTypeSelectItems).appendTo(form);
		
//		JsfSelectOneRadio<PaymentType> select1 = new JsfSelectOneRadio<PaymentType>("paymentTypeRadioSelect")
//		.bindValue(bindOnPresenter().get(TestBacking_._selectedPaymentType))
//		.withSelectItems(TestBacking.paymentTypeSelectItems).appendTo(form);
//		
		JsfSelectOneMenu2<PaymentType> select2 = new JsfSelectOneMenu2<PaymentType>("paymentTypeMenuSelect2", PaymentType.class)
		.bindValue(bindOnPresenter().get(TestBacking_._selectedPaymentType2))
		.withSelectItems(TestBacking.paymentTypeSelectItems).appendTo(form);

//		JsfSelectOneRadio<OrszagVO> orszag1 = new JsfSelectOneRadio<OrszagVO>("orszagRadioSelect")
//		.bindValue(bindOnPresenter().get(TestBacking_._orszag1))
//		.withSelectItems(TestBacking.orszagSelectItems).appendTo(form);
		
//		JsfSelectOneMenu<OrszagVO> orszag2 = new JsfSelectOneMenu<OrszagVO>("orszagMenuSelect")
//		.bindValue(bindOnPresenter().get(TestBacking_._orszag2))
//		.withSelectItems(TestBacking.orszagSelectItems).appendTo(form);

//		JsfSelectOneRadio2<OrszagVO> orszag2 = 
//		new JsfSelectOneRadio2<OrszagVO>("orszagRadioSelect2", OrszagVO.class)
//		.bindValue(bindOnPresenter().get(TestBacking_._orszag1))
//		.withSelectItems(TestBacking.orszagSelectItems)
//		.withConverter(new OrszagVOConverter())
//		.appendTo(form);

		
		new JsfCustomElement("div", "visibleHiddenDiv");
		
//		JsfPanelGroup pg = new JsfPanelGroup("visibleHiddenPanelGroup").rendered(TestBacking_._isPGVisible)).appendTo(form); 
		
		JsfPanelGroup pg = new JsfPanelGroup("visibleHiddenPanelGroup").rendered(bindOnPresenter().get(TestBacking_._pGVisible)).appendTo(form);
				
		JsfSelectOneMenu2<OrszagVO> orszag2 = new JsfSelectOneMenu2<OrszagVO>("orszagMenuSelect2", OrszagVO.class)
		.bindValue(bindOnPresenter().get(TestBacking_._orszag2))
		.withSelectItems(TestBacking.orszagSelectItems)
		.withConverter(new OrszagVOConverter())
		.appendTo(pg);
		
		new JsfCustomElement("abc", "abc1").appendTo(form).withAttribute("attr1", "attr1val1").withAttribute("attr2", "attr2val2").withAttribute("attr3", "attr3val3")
			.withAttribute( "attrX", bindOnPresenter().get(TestBacking_._selectedPaymentType2));

//		
//		new JsfInputHidden("inputHidden1").bind(bindOnPresenter().get(TestBacking_._inputHidden1)).withValue("300").appendTo(form);
//		JsfCustomElement div = new JsfCustomElement("div").appendTo(form);
//		new JsfInputText("hprop1").bind(JsfBindings.on(DataHolder.class, "TestBacking.dataHolder").get(DataHolder_._prop1)).appendTo(div);
//		new JsfInputText("hprop2").bind(JsfBindings.on(DataHolder.class, "TestBacking.dataHolder").get(DataHolder_._prop2)).appendTo(div);
//		
//		JsfCustomElement div2 = new JsfCustomElement("div", "div2").withStyleClasses("row").appendTo(form);
//		JsfCustomElement div21 = new JsfCustomElement("div", "div21").withStyleClasses("span2").appendTo(div2);
//		   new JsfLabel("lbl21", "label21").withStyle("background-color:yellow;").appendTo(div21);
//		JsfCustomElement div22 = new JsfCustomElement("div", "div22").withStyleClasses("span3").appendTo(div2);
//			new JsfInputText("tb22").bind(bindOnPresenter().get(TestBacking_._val22)).appendTo(div22);
//		JsfCustomElement div23 = new JsfCustomElement("div", "div23").withStyleClasses("span6").appendTo(div2);
//		   new JsfLabel("lbl23", "label23").withStyle("background-color:lightgreen;").appendTo(div23);
//		
//		PInputText valpit = new PInputText("valpit").withDisabled(false).withMaxLength(10).withRequired(true).withRequiredMessage("ÉÉÉÓÓÓÉÉÉÓÓÓ!").appendTo(form);
//
//		JsfPanelGroup pg1 = new JsfPanelGroup("pg1").withStyleClasses("panelGroup").rendered(new ConstantValueBinding<Boolean>(Boolean.TRUE)).appendTo(form);
	}
	


}
