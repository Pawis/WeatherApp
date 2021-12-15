package com.example.WeatherApp.service;

import java.util.List;

import com.example.WeatherApp.model.openweathermap.DailyWeather.Daily;


public interface WeatherService {
	
	public List<Daily> getDailyWeather();
	
	public Object[][] getDailyWeatherChart();
	

}
