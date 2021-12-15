package com.example.WeatherApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.WeatherApp.model.WeatherDTO.WeatherDTO;
import com.example.WeatherApp.rest.WeatherbitRestController;

public class WeatherbitServiceImpl implements WeatherService {

	@Autowired
	private WeatherbitRestController weatherbitRest;

	@Override
	public List<WeatherDTO> getDailyWeather() {
		
		return null;
		
	}

	@Override
	public Object[][] getDailyWeatherChart() {
		
		List<Daily> dailyWeather = weatherbitRest.getDailyWeather();
		
		return null;
	}

}
