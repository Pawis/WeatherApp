package com.example.WeatherApp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeatherApp.model.CurrentWeather.CurrentWeather;
import com.example.WeatherApp.model.DailyWeather.Daily;
import com.example.WeatherApp.rest.WeatherRestController;


@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
	private WeatherRestController weatherRest;
	
	public CurrentWeather getCurrentWeather(String city) {
		
		return weatherRest.getCurrentWeather(city);
		
	}

	@Override
	public List<Daily> getDailyWeather() {
		
		return weatherRest.getDailyWeather();
	}

	@Override
	public Object[][] getDailyWeatherChart() {
		
		
		return null;
	}
	
	
}
