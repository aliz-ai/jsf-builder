package com.doctusoft.primefaces.comp.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfInputModel;

@Getter @Setter
public class PCalendarModel extends JsfInputModel<Date> {
	
	private ValueBinding<String> locale;
	private ValueBinding<Date> minDate;
	private ValueBinding<Date> maxDate;
	private ValueBinding<String> minValidationMessage;
	private ValueBinding<String> maxValidationMessage;
	private String yearRange;
	private ValueBinding<Date> pageDate;
	private String widgetVar;
	private boolean navigator = true;
	private ValueBinding<String> pattern;
	
}
