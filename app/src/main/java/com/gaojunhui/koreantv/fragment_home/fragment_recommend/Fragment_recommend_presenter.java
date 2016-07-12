package com.gaojunhui.koreantv.fragment_home.fragment_recommend;

import android.widget.Toast;

import com.gaojunhui.koreantv.dao.RecommandBeans;
import com.gaojunhui.koreantv.fragment_home.Fragment_home_contract;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_recommend_presenter implements Fragment_recommend_contract.Presenter {
    private Fragment_recommend_contract.View view;
    private Fragment_recommend_contract.Model model;

    public Fragment_recommend_presenter(Fragment_recommend_contract.View view
            , Fragment_recommend_contract.Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void initHttp() {
        model.initHttp();

    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void eventResult(RecommandBeans recommandBeans){
        if (recommandBeans==null){
            view.onFail("faillllllllll");
        }else {
            view.onSucess(recommandBeans);
        }
    }
}
