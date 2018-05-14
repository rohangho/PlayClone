package com.example.android.clone2.fragments.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.clone2.R;
import com.example.android.clone2.fragments.home.topCharts.TopFreeAppsFragment;
import com.example.android.clone2.viewPager.CustomViewPager;

import java.util.Objects;



public class HomeTopChartsFragment extends Fragment {

    public HomeTopChartsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top_charts, container, false);

        CustomViewPager viewPager = view.findViewById(R.id.vp_app_list);
        setupViewPager(viewPager);

        TabLayout subTabLayout = view.findViewById(R.id.tl_app_list);
        subTabLayout.setupWithViewPager(viewPager);

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        com.example.android.clone2.adapters.ViewPagerAdapter adapter = new com.example.android.clone2.adapters.ViewPagerAdapter(Objects.requireNonNull(getActivity()).getSupportFragmentManager());
        adapter.addFragment(new TopFreeAppsFragment(), "TOP FREE APPS");
        adapter.addFragment(new TopFreeAppsFragment(), "TOP FREE GAMES");
        adapter.addFragment(new TopFreeAppsFragment(), "TOP GROSSING");
        adapter.addFragment(new TopFreeAppsFragment(), "TRENDING");
        viewPager.setAdapter(adapter);
    }
}
