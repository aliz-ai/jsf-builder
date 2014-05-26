package com.doctusoft.primefaces.renderer;

import java.util.Date;

import org.primefaces.component.calendar.Calendar;

import com.doctusoft.jsf.render.JsfInputRenderer;
import com.doctusoft.primefaces.comp.model.PCalendarModel;

public class PCalendarRenderer extends JsfInputRenderer<Calendar, PCalendarModel, Date> {

	public PCalendarRenderer(PCalendarModel model) {
		super(new Calendar(), model, Date.class);
		component.setMode("popup");
		bind("locale", model.getLocale());
		bind("minDate", model.getMinDate(), Date.class);
		bind("maxDate", model.getMaxDate(), Date.class);
		component.setYearRange(model.getYearRange());
		bind("pageDate", model.getPageDate(), Date.class);
		component.setWidgetVar(model.getWidgetVar());
		component.setNavigator(model.isNavigator());
		bind("pattern", model.getPattern(), String.class);
	}

	
}
