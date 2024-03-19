package com.richydev.pruebatecnica_ra.retrofit.api;

import com.richydev.pruebatecnica_ra.util.ConstantsUtil;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokemonRetrofit {

    private static Retrofit retrofit;
    private static PokemonApiServices pokemonApiServices;

    public void createRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl(ConstantsUtil.Base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Retrofit getRetrofit() {
        return retrofit;
    }

//    public boolean isConnected(){return Po}
}
