package edu.self.viewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class MasterFragment extends Fragment {

    private NumberViewModel numberViewModel;
    private Button sendNumber;
    private View.OnClickListener onSendNumberClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Integer randomInteger = new Random().nextInt(10);
            numberViewModel.setNumber(randomInteger);
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master, container, false);
        sendNumber = view.findViewById(R.id.send_number);
        sendNumber.setOnClickListener(onSendNumberClicked);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        numberViewModel = ViewModelProviders.of(getActivity()).get(NumberViewModel.class);
    }

}
