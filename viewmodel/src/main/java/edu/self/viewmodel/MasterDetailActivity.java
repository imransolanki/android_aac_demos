package edu.self.viewmodel;

import android.os.Bundle;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MasterDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_detail);
        replaceFragment(new MasterFragment(), R.id.master_container);
        replaceFragment(new DetailFragment(), R.id.detail_container);
    }

    private void replaceFragment(Fragment fragment, @IdRes int containerId) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(containerId, fragment, fragment.getClass().getName())
                .commit();
    }
}
