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
    void getDatosPersona (@Query("modulo") int modulo, @Query("key") String key, @Query("valor") String valor,
                          Call<Persona> personaCallback);

    @GET("/")
    void getDatosPatente (@Query("modulo") int modulo, @Query("key") String key, @Query("valor") String valor,
                          Call<Persona> personaCallback);


    @GET("/")
    void getDatosIMEI (@Query("modulo") int modulo, @Query("key") String key, @Query("valor") String valor,
                          Call<Persona> personaCallback);


}
