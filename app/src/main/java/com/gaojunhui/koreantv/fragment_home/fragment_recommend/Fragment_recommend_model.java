package com.gaojunhui.koreantv.fragment_home.fragment_recommend;

import com.gaojunhui.koreantv.fragment_home.Fragment_home_contract;
import com.gaojunhui.koreantv.httputils.HttpUtils;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_recommend_model implements Fragment_recommend_contract.Model {
    @Override
    public void initHttp() {
        HttpUtils.newInstance().getHttpResult();
    }
}
