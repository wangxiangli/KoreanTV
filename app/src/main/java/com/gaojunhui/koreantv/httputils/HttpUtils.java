package com.gaojunhui.koreantv.httputils;

import com.gaojunhui.koreantv.dao.Constant;
import com.gaojunhui.koreantv.dao.RecommandBeans;
import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 嘉华盛世 on 2016-07-12.
 */
public class HttpUtils {
    private IRetrofitService retrofitService;
    private MyHttpCallBack callBack;
    private static HttpUtils httpUtils;
    //

    public HttpUtils(){
        Retrofit retrofit=new Retrofit
                .Builder()
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
        .baseUrl(Constant.RECOMMAND_FIRST).build();
        retrofitService=retrofit.create(IRetrofitService.class);
    }
    public static HttpUtils newInstance(){
        if(httpUtils==null){
            httpUtils=new HttpUtils();
        }
        return httpUtils;
    }

    private interface MyHttpCallBack{
        void onSucceed();
        void onFail();
    }
    public void getHttpResult(){
        Call<RecommandBeans> call=retrofitService.getRecommandHome();
        call.enqueue(new Callback<RecommandBeans>() {
            @Override
            public void onResponse(Call<RecommandBeans> call, Response<RecommandBeans> response) {
                EventBus.getDefault().post(response);
            }

            @Override
            public void onFailure(Call<RecommandBeans> call, Throwable t) {
                EventBus.getDefault().post(null);
            }
        });

    }

   /* private void getCommomMethod() {
        Call<ResponseBody> call=retrofitService.getRecommandHome();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }*/
}
