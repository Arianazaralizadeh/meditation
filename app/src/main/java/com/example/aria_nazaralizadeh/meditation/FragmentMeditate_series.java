package com.example.aria_nazaralizadeh.meditation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMeditate_series extends Fragment {

public static FragmentMeditate_series newInstance(){
    return new FragmentMeditate_series();
}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.meditatefragment_seriesfragment, container, false);
    }

}
