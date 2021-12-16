package com.example.WeatherApp.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.WeatherApp.model.openweathermap.DailyWeather.Daily;
import com.example.WeatherApp.model.weatherbit.DailyWeather.Data;
import com.example.WeatherApp.rest.OpenWeatherMapRestController;
import com.example.WeatherApp.rest.WeatherbitRestController;

@CacheConfig(cacheNames= {"weather"})
@Service
public class OpenWeatherMapServiceImpl implements WeatherService {

	@Autowired
	private OpenWeatherMapRestController openWeatherMapRest;

	@Autowired
	private WeatherbitRestController weatherbitRest;

	@Override
	public List<Daily> getDailyWeather(String lat, String lon) {

		return  openWeatherMapRest.getDailyWeather(lat,lon);

	}
	
	@Cacheable
	@Override
	public Object[][] getDailyWeatherChart(String lat,String lon) {

		List<Daily> openWeatherMap = openWeatherMapRest.getDailyWeather(lat, lon);
		List<Data> weatherbit = weatherbitRest.getDailyWeather();

		SimpleDateFormat formatter = new SimpleDateFormat("EEEEE");

		Object[][] data = new Object[7][3];
		data[0][0] = "Dzien";
		data[0][1] = "OpenWeatherMap";
		data[0][2] = "Weatherbit";
		for (int i = 1; i < 7; i++) {
			//data[i][0] = formatter.format(new Date(openWeatherMap.get(i).getDt() * 1000));
			data[i][0] = openWeatherMap.get(i).getDt();
			data[i][1] = openWeatherMap.get(i).getTemp().getDay();
			data[i][2] = weatherbit.get(i).getTemp();
		}

		return data;
	}

}
