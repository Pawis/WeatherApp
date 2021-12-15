package com.example.WeatherApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.WeatherApp.model.openweathermap.DailyWeather.Daily;
import com.example.WeatherApp.rest.WeatherbitRestController;

public class WeatherbitServiceImpl implements WeatherService {

	@Autowired
	private WeatherbitRestController weatherbitRest;

	@Override
	public List<Daily> getDailyWeather() {
		
		return weatherbitRest.getDailyWeather();
		
	}

	@Override
	public Object[][] getDailyWeatherChart() {
		// TODO Auto-generated method stub
		return null;
	}

}
