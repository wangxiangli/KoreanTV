package com.gaojunhui.koreantv.httputils;

import com.gaojunhui.koreantv.dao.RecommandBeans;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Created by 嘉华盛世 on 2016-07-12.
 */
public interface IRetrofitService {
    @GET("korean/servers/Korean_Info.ashx?method=get_korean_tabchange&type=8&page=1&count=8&os=android&version=1170&channel=qq&pkgname=com.leku.hmsq")
    Call<RecommandBeans> getRecommandHome();
    @GET("/{path}/login")
    Call<ResponseBody> getHttpResult(@Path("path")
                                     String path,
                                     @QueryMap
                                     HashMap<String ,String> map);

    @GET("/{path}/init")
    Call<RecommandBeans> initHttp(@Path("path")
                                  String path,
                                  @QueryMap
                                  HashMap<String ,String> map);

}
