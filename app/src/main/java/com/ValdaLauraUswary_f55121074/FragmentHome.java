package com.ValdaLauraUswary_f55121074;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ValdaLauraUswary_f55121074.Fragmentlayout_F55121074.R;

public class FragmentHome extends Fragment {
    View view;
    public FragmentHome(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.home_fragment_074,container,false);
        return view;
    }
}