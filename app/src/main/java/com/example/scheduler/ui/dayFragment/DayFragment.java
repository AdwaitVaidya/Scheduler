package com.example.scheduler.ui.dayFragment;

import androidx.fragment.app.FragmentContainer;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.scheduler.R;
import com.example.scheduler.ui.home.HomeViewModel;

public class DayFragment extends Fragment {

    private DayViewModel mViewModel;

    public static DayFragment newInstance() {
        return new DayFragment();
    }
    private DayViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FragmentContainer fragmentContainer = new FragmentContainer() {
            @Nullable
            @Override
            public View onFindViewById(int id) {
                return onFindViewById(R.id.fragment_container_view_tag);
            }

            @Override
            public boolean onHasView() {
                return false;
            }
        };
        homeViewModel = new ViewModelProvider(this).get(DayViewModel.class);
        View root = inflater.inflate(R.layout.day_fragment, container, false);
      /*  final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DayViewModel.class);
        // TODO: Use the ViewModel
    }

}