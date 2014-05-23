package com.doctusoft.jsf.comp;

import static com.google.common.base.Preconditions.checkState;

import java.util.List;

import com.doctusoft.bean.ParametricClassMethodReferences.ClassMethodReference1;
import com.doctusoft.bean.binding.EmptyEventHandler;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.bean.binding.ValueBindingBuilder;
import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.jsf.binding.ELRootBinding;
import com.doctusoft.jsf.binding.JsfBindings;
import com.doctusoft.jsf.comp.model.JsfRepeatModel;

public class JsfRepeat<T> extends JsfBaseComponent<JsfRepeat<T>, JsfRepeatModel> {
	
	private Class<T> itemType;

	public JsfRepeat(String id, Class<T> itemType) {
		super(id, new JsfRepeatModel());
		this.itemType = itemType;
	}
	
	public JsfRepeat<T> withVar(String var) {
		model.setVar(var);
		return this;
	}
	
	public JsfRepeat<T> withVarStatus(String varStatus) {
		model.setVarStatus(varStatus);
		return this;
	}
	
	public JsfRepeat<T> bind(ValueBinding<List<T>> binding) {
		model.setItems((ValueBinding) binding);
		return this;
	}
	
	public ValueBindingBuilder<T> bindOnItem() {
		checkState(model.getVar() != null, "The `var` attribute must be set to provide binding on the repeat item");
		return JsfBindings.on(itemType, model.getVar());
	}

	public <Presenter> EmptyEventHandler itemMethod(final AbstractBackingView<Presenter> view, final ClassMethodReference1<Presenter, Void, T> handlerMethodRef) {
		return new EmptyEventHandler() {
			@Override
			public void handle() {
				T itemVar = ELRootBinding.resolve(itemType, model.getVar());
				handlerMethodRef.apply(view.resolveBacking(), itemVar);
			}
		};
	}
}
