package com.example.git;

import com.example.git.bean.FuBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface MyServer {
    public String url = "https://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/";
    @GET
    Observable<FuBean> FugetData(@Url String url);
}
