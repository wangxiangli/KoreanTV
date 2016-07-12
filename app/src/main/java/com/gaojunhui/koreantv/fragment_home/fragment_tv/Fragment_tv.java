package com.gaojunhui.koreantv.fragment_home.fragment_tv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.gaojunhui.koreantv.BaseFragmen;
import com.gaojunhui.koreantv.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_tv extends BaseFragmen implements Fragment_tv_contract.View {
    @InjectView(R.id.image_tv_head)
    ImageView imageTvHead;
    @InjectView(R.id.gridView_top3)
    GridView gridViewTop3;
    @InjectView(R.id.textView_hot)
    TextView textViewHot;
    @InjectView(R.id.textView_more)
    TextView textViewMore;
    @InjectView(R.id.gridView_hot)
    GridView gridViewHot;
    @InjectView(R.id.textView_update)
    TextView textViewUpdate;
    @InjectView(R.id.textView_more2)
    TextView textViewMore2;
    @InjectView(R.id.gridView_update)
    GridView gridViewUpdate;
    @InjectView(R.id.gridView_label)
    GridView gridViewLabel;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home_tv, null);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
