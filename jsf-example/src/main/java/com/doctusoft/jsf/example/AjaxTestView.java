package com.doctusoft.jsf.example;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfAjaxBehavior;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfCustomContent;
import com.doctusoft.jsf.comp.JsfCustomElement;
import com.doctusoft.jsf.comp.JsfForm;
import com.doctusoft.jsf.comp.JsfInputText;
import com.doctusoft.jsf.comp.JsfOutputText;
import com.doctusoft.jsf.comp.JsfPanelGroup;
import com.doctusoft.jsf.comp.JsfSelectOneMenu;
import com.doctusoft.jsf.example.util.SelectUtils;

public class AjaxTestView extends AbstractBackingView<AjaxTestBacking> {
	
	public AjaxTestView() {
		super(AjaxTestBacking.class, "AjaxTestBacking", "ajaxtest");
		JsfForm form = new JsfForm("testForm").appendTo(container);
		new JsfInputText("testInput").bind(bindOnPresenter().get(AjaxTestBacking_._inputValue)).appendTo(form);
		new JsfAjaxBehavior().applyOn(new JsfButton("testButton", "Ajax action")
				.action(presenterMethod(AjaxTestBacking_.__testMethod))
				.appendTo(form));
		new JsfOutputText("output").bind(bindOnPresenter().get(AjaxTestBacking_._message)).appendTo(form);
		// custom ajax event example
		new JsfCustomElement("hr").appendTo(form);
		new JsfCustomContent("<h4>Ajax onchange example</h4>").appendTo(form);
		JsfPanelGroup refreshGroup = new JsfPanelGroup("testArea");
		new JsfSelectOneMenu<String>("testSelect").bind(bindOnPresenter().get(AjaxTestBacking_._selectedValue))
				.withSelectItems(SelectUtils.stringSelectItems(new String[] {"first", "second", "third"}))
				.withAjax(new JsfAjaxBehavior().withEvent("change").execute("@this").render(refreshGroup))
				.appendTo(form);
		refreshGroup.appendTo(container);
		new JsfCustomContent("ajax updated output outside the form: ").appendTo(refreshGroup);
		new JsfOutputText("selectedValue").bind(bindOnPresenter().get(AjaxTestBacking_._selectedValue)).appendTo(refreshGroup);
	}

}
