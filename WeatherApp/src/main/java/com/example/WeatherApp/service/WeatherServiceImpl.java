package com.example.WeatherApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeatherApp.model.CurrentWeather.CurrentWeather;
import com.example.WeatherApp.model.DailyWeather.Daily;
import com.example.WeatherApp.model.DailyWeather.DailyWeather;
import com.example.WeatherApp.rest.WeatherRestController;

import reactor.core.publisher.Mono;

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
	
	
}
