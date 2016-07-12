package com.gaojunhui.koreantv.fragment_home.fragment_movie;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaojunhui.koreantv.BaseFragmen;
import com.gaojunhui.koreantv.R;
import com.gaojunhui.koreantv.fragment_home.fragment_recommend.Fragment_recommend_contract;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_movie extends BaseFragmen implements Fragment_movie_contract.View{
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home_movie,null);
        return view;
    }
}
