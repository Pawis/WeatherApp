package com.example.WeatherApp.service;

import java.util.List;

import com.example.WeatherApp.model.WeatherDTO.WeatherDTO;


public interface WeatherService {
	
	public List<WeatherDTO> getDailyWeather();
	
	public Object[][] getDailyWeatherChart();
	

}
