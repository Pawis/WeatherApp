package com.example.WeatherApp.service;

import java.util.List;

import com.example.WeatherApp.model.CurrentWeather.CurrentWeather;
import com.example.WeatherApp.model.DailyWeather.Daily;


public interface WeatherService {
	
	public CurrentWeather getCurrentWeather(String city);
	
	public List<Daily> getDailyWeather();
	
	public Object[][] getDailyWeatherChart();
	

}
