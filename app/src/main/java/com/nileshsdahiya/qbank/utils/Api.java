package com.nileshsdahiya.qbank.utils;


import retrofit2.Retrofit;

public class Api {

    public static ApiInterface getClient() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.rkonlinematka.in")
                .build();

        ApiInterface api = retrofit.create(ApiInterface.class);
        return  api;



//        RestAdapter adapter = new RestAdapter.Builder()
//                .setEndpoint("http://healthyblackmen.org") //Setting the Root URL
//                .build(); //Finally building the adapter
//
//        //Creating object for our interface
//        ApiInterface api = adapter.create(ApiInterface.class);
//        return api;
    }
}
