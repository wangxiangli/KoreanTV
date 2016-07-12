package com.gaojunhui.koreantv.fragment_mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaojunhui.koreantv.BaseFragmen;
import com.gaojunhui.koreantv.R;
import com.gaojunhui.koreantv.fragment_home.Fragment_home_contract;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_mine extends BaseFragmen implements Fragment_mine_contract.View{
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_mine,null);
        return view;
    }
}
