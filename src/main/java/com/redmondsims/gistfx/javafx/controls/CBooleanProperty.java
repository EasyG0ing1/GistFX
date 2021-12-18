package com.redmondsims.gistfx.javafx.controls;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;

public class CBooleanProperty extends SimpleBooleanProperty {

	public CBooleanProperty() {super();}


	public CBooleanProperty(Boolean value) {
		super(value);
	}

	public boolean isTrue() {
		return super.getValue().equals(true);
	}

	public boolean isFalse() {
		return super.getValue().equals(false);
	}

	public void setTrue() {super.setValue(true);}

	public void setFalse() {super.setValue(false);}

	public void setChangeListener(ChangeListener<Boolean> listener) {
		super.removeListener(listener);
		super.addListener(listener);
	}

	@Override public void setValue(Boolean value) {super.setValue(value);}

	@Override public Boolean getValue() {return super.getValue();}
}
