package com.example.WeatherApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import com.example.WeatherApp.model.openweathermap.DailyWeather.OpenWeatherMapData;
import com.example.WeatherApp.service.providers.OpenWeatherMapRestController;

public class OpenWeatherMapService implements WeatherService {

	@Autowired
	private OpenWeatherMapRestController openWeatherMapRest;
	
	@Override
	@Cacheable
	public List<OpenWeatherMapData> getDailyWeather(String lat, String lon) {
		
		return  openWeatherMapRest.getDailyWeather(lat,lon);
		
	}

	@Override
	@Cacheable
	public Object[][] getDailyWeatherChart(String lat, String lon) {
		
		
		 List<OpenWeatherMapData> OpenWeatherMapData = openWeatherMapRest.getDailyWeather(lat, lon);
		Object [][] openWeatherMapChart = new Object [7][1];
		
		openWeatherMapChart[0][1] = "Dzien";
		openWeatherMapChart[0][2] = "OpenWeatherMapData";
		for (int i = 1; i < 7; i++) {
			openWeatherMapChart[i][0] = OpenWeatherMapData.get(i).getDt();
			openWeatherMapChart[i][1] = OpenWeatherMapData.get(i).getTemp().getDay();
		}
		
		return openWeatherMapChart;
	}

}
