package edu.self.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class LocalUserViewModel extends AndroidViewModel {
    private MutableLiveData<String> user;

    public LocalUserViewModel(Application application) {
        super(application);
    }

    public MutableLiveData<String> getUser() {
        if (user == null) {
            user = new MutableLiveData<>();
            loadUser();
        }
        return user;
    }

    private void loadUser() {
        String localUser = getApplication().getApplicationContext().getString(R.string.local_user_name);
        user.setValue(localUser);
    }

    @Override
    protected void onCleared() {
        user = null;
        super.onCleared();
    }
}
