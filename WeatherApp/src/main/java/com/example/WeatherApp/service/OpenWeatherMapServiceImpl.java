package com.example.WeatherApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.WeatherApp.model.TomorrowIo.DailyWeather.Root;
import com.example.WeatherApp.model.TomorrowIo.DailyWeather.data;
import com.example.WeatherApp.model.TomorrowIo.DailyWeather.intervals;
import com.example.WeatherApp.model.TomorrowIo.DailyWeather.timelines;
import com.example.WeatherApp.model.openweathermap.DailyWeather.OpenWeatherMapData;
import com.example.WeatherApp.model.weatherbit.DailyWeather.WeatherBitData;
import com.example.WeatherApp.rest.OpenWeatherMapRestController;
import com.example.WeatherApp.rest.TomorrowIoRestController;
import com.example.WeatherApp.rest.WeatherbitRestController;

@CacheConfig(cacheNames= {"weather"})
@Service
public class OpenWeatherMapServiceImpl implements WeatherService {

	@Autowired
	private OpenWeatherMapRestController openWeatherMapRest;
	
	@Autowired
	private WeatherbitRestController weatherbitRest;
	
	@Autowired
	private TomorrowIoRestController tomorrowioRest;
	

	@Override
	public List<OpenWeatherMapData> getDailyWeather(String lat, String lon) {

		return  openWeatherMapRest.getDailyWeather(lat,lon);

	}
	
	@Cacheable(value = "weather")
	@Override
	public Object[][] getDailyWeatherChart(String lat,String lon) {
		
		List<OpenWeatherMapData> openWeatherMap = openWeatherMapRest.getDailyWeather(lat, lon);
		List<WeatherBitData> weatherbit = weatherbitRest.getDailyWeather(lat,lon);
		List<timelines> tomorrowIo = tomorrowioRest.getDailyWeather(lat, lon);

		Object[][] data = new Object[7][4];
		data[0][0] = "Dzien";
		data[0][1] = "OpenWeatherMap";
		data[0][2] = "Weatherbit";
		data[0][3] = "TomorrowIo";
		for (int i = 1; i < 7; i++) {
			data[i][0] = openWeatherMap.get(i).getDt();
			data[i][1] = openWeatherMap.get(i).getTemp().getDay();
			data[i][2] = weatherbit.get(i).getTemp();
			data[i][3] = tomorrowIo.get(0).getIntervals().get(i).getValues().getTemperature();
		}

		return data;
	}

}
