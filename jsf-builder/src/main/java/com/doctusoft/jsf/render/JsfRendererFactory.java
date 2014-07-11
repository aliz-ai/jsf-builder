package com.doctusoft.jsf.render;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import com.doctusoft.jsf.AbstractRendererFactory;
import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;
import com.doctusoft.jsf.comp.model.JsfButtonModel;
import com.doctusoft.jsf.comp.model.JsfCheckboxModel;
import com.doctusoft.jsf.comp.model.JsfCommandLinkModel;
import com.doctusoft.jsf.comp.model.JsfCustomContentModel;
import com.doctusoft.jsf.comp.model.JsfCustomElementModel;
import com.doctusoft.jsf.comp.model.JsfFormModel;
import com.doctusoft.jsf.comp.model.JsfInputHiddenModel;
import com.doctusoft.jsf.comp.model.JsfInputTextModel;
import com.doctusoft.jsf.comp.model.JsfLabelModel;
import com.doctusoft.jsf.comp.model.JsfLinkModel;
import com.doctusoft.jsf.comp.model.JsfMessageModel;
import com.doctusoft.jsf.comp.model.JsfNumberInputModel;
import com.doctusoft.jsf.comp.model.JsfOutputTextModel;
import com.doctusoft.jsf.comp.model.JsfPanelGroupModel;
import com.doctusoft.jsf.comp.model.JsfRepeatModel;
import com.doctusoft.jsf.comp.model.JsfSelectOneMenuModel;
import com.doctusoft.jsf.comp.model.JsfSelectOneRadioModel;
import com.doctusoft.jsf.comp.model.JsfTextareaModel;
import com.doctusoft.jsf.custom.CustomContentComponent;
import com.doctusoft.jsf.custom.CustomElementComponent;

public class JsfRendererFactory extends AbstractRendererFactory {
	
	public JsfRendererFactory() {
		// register custom components
		Application app = FacesContext.getCurrentInstance().getApplication();
		app.addComponent(CustomElementComponent.COMPONENT_TYPE, CustomElementComponent.class.getName());
		app.addComponent(CustomContentComponent.COMPONENT_TYPE, CustomContentComponent.class.getName());
	}
	
	
	public Renderer resolveRenderer(JsfBaseComponentModel model) {
		if (model instanceof JsfLabelModel)
			return new JsfLabelRenderer((JsfLabelModel) model);
		if (model instanceof JsfPanelGroupModel)
			return new JsfPanelGroupRenderer((JsfPanelGroupModel) model);
		if (model instanceof JsfButtonModel)
			return new JsfButtonRenderer((JsfButtonModel) model);
		if (model instanceof JsfInputTextModel)
			return new JsfInputTextRenderer((JsfInputTextModel) model);
		if (model instanceof JsfCheckboxModel)
			return new JsfCheckboxRenderer((JsfCheckboxModel) model);
		if (model instanceof JsfTextareaModel)
			return new JsfTextareaRenderer((JsfTextareaModel) model);
		if (model instanceof JsfOutputTextModel)
			return new JsfOutputTextRenderer((JsfOutputTextModel) model);
		if (model instanceof JsfFormModel)
			return new JsfFormRenderer((JsfFormModel) model);
		if (model instanceof JsfSelectOneMenuModel)
			return new JsfSelectOneMenuRenderer((JsfSelectOneMenuModel) model);
		if (model instanceof JsfSelectOneRadioModel)
			return new JsfSelectOneRadioRenderer((JsfSelectOneRadioModel) model);
		if (model instanceof JsfCustomElementModel)
			return new JsfCustomElementRenderer((JsfCustomElementModel) model);
		if (model instanceof JsfCustomContentModel)
			return new JsfCustomContentRenderer((JsfCustomContentModel) model);
		if (model instanceof JsfRepeatModel)
			return new JsfRepeatRenderer((JsfRepeatModel) model);
		if (model instanceof JsfInputHiddenModel)
			return new JsfInputHiddenRenderer((JsfInputHiddenModel) model);
		if (model instanceof JsfMessageModel)
			return new JsfMessageRenderer((JsfMessageModel) model);
		if (model instanceof JsfNumberInputModel)
			return new JsfNumberInputRenderer((JsfNumberInputModel) model);
		if (model instanceof JsfLinkModel)
			return new JsfLinkRenderer((JsfLinkModel) model);
		if (model instanceof JsfCommandLinkModel) 
			return new JsfCommandLinkRenderer((JsfCommandLinkModel) model);
		return null;
	}

}
