package com.nileshsdahiya.qbank.utils;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {


    // For POST request

    @FormUrlEncoded    // annotation that used with POST type request
    @POST("/Api/insert.php") // specify the sub url for our base url
    public void login(
            @Field("ques") String ques,
            @Field("ansa") String ansa,
            @Field("ansb") String ansb,
                    @Field("ansc") String ansc,
                    @Field("ansd") String ansd,
                    @Field("ansr") String ansr, Callback<DataModel> callback);

//user_email and user_pass are the post parameters and SignUpResponse is a POJO class which recieves the response of this API


// for GET request

//    @GET("/Api/show.php") // specify the sub url for our base url
//    public void getDataList(Callback<List<DataModel>> callback);

// CountryResponse is a POJO class which receives the response of this API
}
