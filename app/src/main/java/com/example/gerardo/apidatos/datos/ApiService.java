package com.example.gerardo.apidatos.datos;

import com.example.gerardo.apidatos.modelo.Persona;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Gerardo on 24/09/2016.
 */
public interface ApiService {

    @GET("/")
    Call<Persona> getDatosPersona (@Query(ApiConstants.PARAM_MODULO) String modulo, @Query(ApiConstants.PARAM_KEY) String key,
                          @Query(ApiConstants.PARAM_VALOR) String valor);

    @GET("/")
    void getDatosPatente (@Query(ApiConstants.PARAM_MODULO) String modulo, @Query(ApiConstants.PARAM_KEY) String key,
                          @Query(ApiConstants.PARAM_VALOR) String valor,
                          Call<Persona> personaCallback);


    @GET("/")
    void getDatosIMEI (@Query(ApiConstants.PARAM_MODULO) String modulo, @Query(ApiConstants.PARAM_KEY) String key,
                       @Query(ApiConstants.PARAM_VALOR) String valor,
                          Call<Persona> personaCallback);


}
