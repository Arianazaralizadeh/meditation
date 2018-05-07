package com.example.aria_nazaralizadeh.meditation;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import butterknife.BindView;
import butterknife.ButterKnife;


public class mainactivity_meditatefragment extends Fragment {

//
//    @BindView(R.id.tab) TabLayout tabLayout;
//    @BindView(R.id.view_pajer) ViewPager viewPager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        View view = inflater.inflate(R.layout.fragmentmeditate_main, container, false);

        return inflater.inflate(R.layout.fragmentmeditate_main, container, false);

//        ButterKnife.bind(tabLayout,view);
//        ButterKnife.bind(viewPager,view);

//        TableLayout tableLayout=(TableLayout)view.findViewById(R.id.tab);
//        ViewPager viewPager=(ViewPager) view.findViewById(R.id.view_pajer);
//
//        fragment_mainactivity_adaptor adaptor=new fragment_mainactivity_adaptor(getFragmentManager());
//        viewPager.setAdapter(adaptor);
//        tableLayout.setupWithViewPager(viewPager);
//        viewPager.setAdapter(new fragment_mainactivity_adaptor(getChildFragmentManager()));


//        return view;


    }





}
