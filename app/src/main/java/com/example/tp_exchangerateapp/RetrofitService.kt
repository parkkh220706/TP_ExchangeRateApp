package com.example.tp_exchangerateapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RetrofitService {
    @GET("/site/program/financial/exchangeJSON?authkey=hyYNgHl3GrwRPTspXZ2awmqgRTBfgn9J&searchdate=&data=AP01")

    fun searchExchange(
        @Header("authkey") pw: String = "hyYNgHl3GrwRPTspXZ2awmqgRTBfgn9J",
        @Header("searchdate") date: String = "",
        @Header("data") type: String = "AP01"
        ): Call<String>

}