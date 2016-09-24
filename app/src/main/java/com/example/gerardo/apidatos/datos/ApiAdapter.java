package com.example.gerardo.apidatos.datos;

import retrofit2.Retrofit;

/**
 * Created by Gerardo on 24/09/2016.
 */
public class ApiAdapter {

    private static ApiService API_SERVICE;

    //SINGLETON

    public static ApiService getApiService(){
        if (API_SERVICE!=null){
            Retrofit adapter = new Retrofit.Builder().baseUrl(ApiConstants.URL_BASE)
                    .build();

            API_SERVICE = adapter.create(ApiService.class);

        }
        return API_SERVICE;
    }

}
