package com.hexagonsi.jmalek.buttondatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class ButtonModel extends BaseObservable {
    private boolean selected = false;

    @Bindable
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        notifyPropertyChanged(BR.selected);
    }
}
