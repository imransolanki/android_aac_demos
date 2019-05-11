package edu.self.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NumberViewModel extends ViewModel {
    private final MutableLiveData<Integer> number = new MutableLiveData<>();

    public LiveData<Integer> getNumber() {
        return number;
    }

    public void setNumber(final Integer newNumber) {
        number.setValue(newNumber);
    }
}
