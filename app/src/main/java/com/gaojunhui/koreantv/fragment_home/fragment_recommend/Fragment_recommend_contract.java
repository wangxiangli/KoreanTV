package com.gaojunhui.koreantv.fragment_home.fragment_recommend;

import com.gaojunhui.koreantv.IBaseModel;
import com.gaojunhui.koreantv.IBasePresenter;
import com.gaojunhui.koreantv.IBaseView;
import com.gaojunhui.koreantv.dao.RecommandBeans;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_recommend_contract {
    interface View extends IBaseView{
        void onSucess(RecommandBeans recommandBeans);
        void onFail(String failmsg);
    }
    interface Model extends IBaseModel{
        void initHttp();
    }
    interface Presenter extends IBasePresenter{
        void initHttp();
    }
}
