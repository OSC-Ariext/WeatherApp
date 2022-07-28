package com.plcoding.weatherapp.domain.weather

data class WeatherInfo(
    val weatherdataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)