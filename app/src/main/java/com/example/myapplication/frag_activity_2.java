package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.support.v4.app.*;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import android.os.Bundle;

public class frag_activity_2 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fraglayout_2,container,false);
    }

}