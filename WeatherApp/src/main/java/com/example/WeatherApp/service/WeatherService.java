package com.example.WeatherApp.service;

import java.util.List;

import com.example.WeatherApp.model.openweathermap.DailyWeather.OpenWeatherMapData;


public interface WeatherService {
	
	public List<OpenWeatherMapData> getDailyWeather(String lat,String lon);
	
	public Object[][] getDailyWeatherChart(String lat,String lon);
	
}
