package edu.self.viewmodel;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


public class MainActivity extends AppCompatActivity {

    private TextView text;
    private LocalUserViewModel localUserViewModel;
    private RemoteUserViewModel remoteUserViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.user);

        initialiseLocalUser();

        initialiseRemoteUser();
    }

    private void initialiseRemoteUser() {
        remoteUserViewModel = ViewModelProviders.of(this).get(RemoteUserViewModel.class);
        remoteUserViewModel.getUser().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String remoteUser) {
                //Do something with data
            }
        });
    }

    private void initialiseLocalUser() {
        localUserViewModel = ViewModelProviders.of(this).get(LocalUserViewModel.class);
        localUserViewModel.getUser().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String localUser) {
                text.setText(localUser);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
