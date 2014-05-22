package com.doctusoft.jsf.example;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.comp.JsfAjaxBehavior;
import com.doctusoft.jsf.comp.JsfButton;
import com.doctusoft.jsf.comp.JsfForm;
import com.doctusoft.jsf.comp.JsfInputText;
import com.doctusoft.jsf.comp.JsfOutputText;

public class AjaxTestView extends AbstractBackingView<AjaxTestBacking> {
	
	public AjaxTestView() {
		super(AjaxTestBacking.class, "AjaxTestBacking");
		JsfForm form = new JsfForm("testForm").appendTo(container);
		new JsfInputText("testInput").bind(bindOnPresenter().get(AjaxTestBacking_._inputValue)).appendTo(form);
		new JsfAjaxBehavior().applyOn(new JsfButton("testButton", "Ajax action")
				.action(presenterMethod(AjaxTestBacking_.__testMethod))
				.appendTo(form));
		new JsfOutputText("output").bind(bindOnPresenter().get(AjaxTestBacking_._message)).appendTo(form);
	}

}
