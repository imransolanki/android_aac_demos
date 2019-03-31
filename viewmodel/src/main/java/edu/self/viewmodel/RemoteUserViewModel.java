package edu.self.viewmodel;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RemoteUserViewModel extends ViewModel {
    private MutableLiveData<String> user;

    public MutableLiveData<String> getUser() {
        if (user == null) {
            user = new MutableLiveData<>();
            loadUser();
        }
        return user;
    }

    private void loadUser() {
        // Data can be read from network or any other source...
        String randomUser = new String("Imran-Pune-GSLab-Lead Engineer");
        user.setValue(randomUser);
        //user.postValue(localUser); /*This is required if app is updating value from some background thread*/
    }

    @Override
    protected void onCleared() {
        user = null;
        super.onCleared();
    }
}
