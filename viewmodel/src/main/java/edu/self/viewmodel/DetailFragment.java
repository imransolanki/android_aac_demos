package edu.self.viewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class DetailFragment extends Fragment {

    private NumberViewModel numberViewModel;
    private TextView number;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        number = view.findViewById(R.id.number);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        numberViewModel = ViewModelProviders.of(getActivity()).get(NumberViewModel.class);
        numberViewModel.getNumber().observe(getActivity(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                number.setText(integer.toString());
            }
        });
    }
}
