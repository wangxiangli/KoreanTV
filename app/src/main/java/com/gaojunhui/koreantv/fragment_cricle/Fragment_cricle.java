package com.gaojunhui.koreantv.fragment_cricle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaojunhui.koreantv.BaseFragmen;
import com.gaojunhui.koreantv.R;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_cricle extends BaseFragmen implements Fragment_cricle_contract.View {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_cricle,null);
        return view;
    }
}
