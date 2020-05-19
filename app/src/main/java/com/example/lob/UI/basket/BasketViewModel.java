package com.example.lob.UI.basket;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BasketViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public BasketViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is basket");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
