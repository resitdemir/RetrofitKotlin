package com.resitdemir.retrofitkotlin.service

import com.resitdemir.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    @GET("prices?key=522104faa950f44f049b8e08ee4b9fe9")
    fun getData(): Observable<List<CryptoModel>>

    //fun getData(): Call<List<CryptoModel>>
}