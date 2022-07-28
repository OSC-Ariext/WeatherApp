package com.plcoding.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("v1/forecast?hourly=temperature,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeatherDa6a(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double,
    ) : WeatherDto
}