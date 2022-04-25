package com.example.merofirstapp;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;


public class DashboardFragment extends Fragment {

    private  View mainView;
    private CheckBox chkFootball;



    public DashboardFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflate the layout for this fragment
        // this main view is used to find the component of the layout present of the inflater
        mainView = inflater.inflate(R.layout.fragment_dashboard, container, false);
        // here we have to call function related to the view
        findView();
        return mainView;
    }

    private  void findView() {
        // mapping the  view of the fragment_dashboard to chkfootball
        chkFootball = mainView.findViewById(R.id.chkfootball);
    }
}