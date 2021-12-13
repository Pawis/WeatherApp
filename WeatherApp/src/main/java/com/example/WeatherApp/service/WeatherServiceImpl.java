package com.example.WeatherApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeatherApp.model.CurrentWeather.WeatherDTO;
import com.example.WeatherApp.rest.WeatherRestController;

import reactor.core.publisher.Mono;

@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
	private WeatherRestController weatherRest;
	
	public WeatherDTO getCurrentWeather(String city) {
		
		return weatherRest.getCurrentWeather(city);
		
		
		
		

		
	}
	
	
}
