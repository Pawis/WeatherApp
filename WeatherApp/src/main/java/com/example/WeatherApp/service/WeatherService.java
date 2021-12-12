package com.example.WeatherApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WeatherApp.model.WeatherDTO;
import com.example.WeatherApp.rest.WeatherRestController;

@Service
public class WeatherService {

	@Autowired
	private WeatherRestController weatherRest;
	
	public WeatherDTO getCurrentWeather(String city) {
		
		return weatherRest.getCurrentWeather(city);
		
		
		
		

		
	}
	
	
}
