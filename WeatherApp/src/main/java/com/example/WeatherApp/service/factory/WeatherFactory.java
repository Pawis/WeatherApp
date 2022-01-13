package com.example.WeatherApp.service.factory;

import com.example.WeatherApp.service.CombinedWeatherService;
import com.example.WeatherApp.service.OpenWeatherMapService;
import com.example.WeatherApp.service.WeatherService;

public class WeatherFactory {
	
	public static WeatherService getWeatherService(WeatherApiTypes type) {
		
		WeatherService weather = null;
		
		switch(type) {
		case OPENWEATHERMAP:
			weather = new OpenWeatherMapService();
			break;
		case COMBINEDWEATHER:
			weather = new CombinedWeatherService();
			break;
		default:
			break;
		}
		return weather;
	}
}
