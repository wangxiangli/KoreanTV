package com.gaojunhui.koreantv.fragment_cricle.fragmnt_hot;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaojunhui.koreantv.BaseFragmen;
import com.gaojunhui.koreantv.R;
import com.gaojunhui.koreantv.fragment_cricle.Fragment_cricle_contract;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_hot extends BaseFragmen implements Fragment_hot_contract.View {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_cricle_hot,null);
        return view;
    }
}
