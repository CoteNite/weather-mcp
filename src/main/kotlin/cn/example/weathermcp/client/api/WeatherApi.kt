package cn.example.weathermcp.client.api

import cn.example.weathermcp.client.api.rsp.GeoResponse
import cn.example.weathermcp.client.api.rsp.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
 * @Author  RichardYoung
 * @Description
 * @Date  2025/4/14 16:06
 */
interface WeatherApi {

    @GET("/v7/weather/now")
    fun getCurrentWeather(
        @Query("location") location: String,
        @Query("lang") lang: String = "zh",
        @Query("unit") unit: String = "m",
        @Header("Authorization") authorization: String
    ): Call<WeatherResponse>

    @GET("/geo/v2/city/lookup")
    fun getGeoId(
        @Query("location") location: String,
        @Header("Authorization") authorization: String
    ): Call<GeoResponse>

}