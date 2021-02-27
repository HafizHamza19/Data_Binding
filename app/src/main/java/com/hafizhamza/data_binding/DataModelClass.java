package com.hafizhamza.data_binding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class DataModelClass extends BaseObservable {
    String Label1;

    public DataModelClass(String Label1) {
        this.Label1=Label1;
    }

@Bindable
    public String getLabel1() {
        return Label1;
    }
@Bindable
    public void setLabel1(String label1) {
        Label1 = label1;
        notifyPropertyChanged(BR.label1);
    }
}
