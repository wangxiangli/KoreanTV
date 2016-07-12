package com.gaojunhui.koreantv.fragment_home.fragment_recommend;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.gaojunhui.koreantv.BaseFragmen;
import com.gaojunhui.koreantv.R;
import com.gaojunhui.koreantv.dao.RecommandBeans;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;


/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_recommend extends BaseFragmen implements Fragment_recommend_contract.View{
    private View view;
    private PtrClassicFrameLayout ptrClassicFrameLayout;
    private ViewPager viewPager;
    private Fragment_recommend_contract.Presenter mPresenter;
    private Fragment_recommend_contract.Model mModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view =LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home_recommend,null);
        initPtr();
        initHttp();
        return view;
    }

    private void initHttp() {
        mModel=new Fragment_recommend_model();
        mPresenter=new Fragment_recommend_presenter(this,mModel);
    }

//    @Override
//    public void onResume() {
//        super.onResume();
//        mPresenter.initHttp();
//    }

    private void initPtr() {
        ptrClassicFrameLayout= (PtrClassicFrameLayout) view.findViewById(R.id.ptrclassicframelayout);
        ptrClassicFrameLayout.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                ptrClassicFrameLayout.refreshComplete();
                Toast.makeText(getActivity(), "aaaaaaaaaa", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onSucess(RecommandBeans recommandBeans) {
        Log.d("-------", "onSucess: "+recommandBeans.getReMsg()+","+recommandBeans.getReCode());
    }

    @Override
    public void onFail(String failmsg) {
        Log.d("---------", "onFail: " + failmsg);
    }

}
