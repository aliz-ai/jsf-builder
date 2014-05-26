package com.doctusoft.primefaces.comp;

import java.util.Date;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.JsfAbstractInput;
import com.doctusoft.primefaces.comp.model.PCalendarModel;

public class PCalendar extends JsfAbstractInput<PCalendar, Date, PCalendarModel> {

	public PCalendar(String id) {
		super(id, new PCalendarModel());
	}

	public PCalendar locale(ValueBinding<String> binding) {
		model.setLocale(binding);
		return this;
	}
	
	public PCalendar withLocale(String value) {
		return locale(new ConstantValueBinding<String>(value));
	}
	
	public PCalendar minDate(ValueBinding<Date> binding) {
		model.setMinDate(binding);
		return this;
	}
	
	public PCalendar withMinDate(Date value) {
		return minDate(new ConstantValueBinding<Date>(value));
	}
	
	public PCalendar maxDate(ValueBinding<Date> binding) {
		model.setMaxDate(binding);
		return this;
	}
	
	public PCalendar withMaxDate(Date value) {
		return maxDate(new ConstantValueBinding<Date>(value));
	}
	
	public PCalendar withYearRange(String value) {
		model.setYearRange(value);
		return this;
	}
	
	public PCalendar pageDate(ValueBinding<Date> binding) {
		model.setPageDate(binding);
		return this;
	}
	
	public PCalendar withPageDate(Date value) {
		return pageDate(new ConstantValueBinding<Date>(value));
	}
	
	public PCalendar withWidgetVar(String value) {
		model.setWidgetVar(value);
		return this;
	}
	
	public PCalendar withNavigator(boolean value) {
		model.setNavigator(value);
		return this;
	}
	
	public PCalendar pattern(ValueBinding<String> binding) {
		model.setPattern(binding);
		return this;
	}
	
	public PCalendar withPattern(String value) {
		return pattern(new ConstantValueBinding<String>(value));
	}
	
}
