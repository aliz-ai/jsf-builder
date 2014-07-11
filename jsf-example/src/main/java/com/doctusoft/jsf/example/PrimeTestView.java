package com.doctusoft.jsf.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfForm;
import com.doctusoft.primefaces.comp.PCalendar;
import com.doctusoft.primefaces.comp.PCommandButton;
import com.doctusoft.primefaces.comp.PDialog;
import com.doctusoft.primefaces.utils.CalendarDefaultConverter;

@ViewScoped
@ManagedBean(name="PrimeTestView")
public class PrimeTestView extends AbstractBackingView<PrimeTestBacking> {
	
	public PrimeTestView() {
		super(PrimeTestBacking.class, "PrimeTestBacking", "primetest");
		JsfForm form = new JsfForm("mainform").appendTo(container);
		new PCommandButton("testButton", "Test").appendTo(container);

		new PCalendar("oneDate").bind(bindOnPresenter().get(PrimeTestBacking_._oneDate))
			.withRequired(true)
			.withRequiredMessage("Kötelező!!!")
			.withLocale("hu")
			.withPattern("yyyy.MM.dd.")
			.withWidgetVar("oneDateWidget")
			.withNavigator(true)
			.withConverter(new CalendarDefaultConverter())
			.appendTo(form);
	
		new JsfButton("dialogButton", "open dialog").appendTo(container).onclick("dialogVar.show()");
		new PDialog("dialogTest").width(300).height(200).header("I'm the header").widgetVar("dialogVar").modal().resizable(false).appendTo(container);
	}

}
