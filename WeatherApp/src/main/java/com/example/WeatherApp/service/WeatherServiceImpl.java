package com.example.WeatherApp.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
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
		
		List<Daily> dailyWeather = weatherRest.getDailyWeather();
		
		  SimpleDateFormat formatter = new SimpleDateFormat("EEEEE");  
		  
		Object[][] data = new Object[dailyWeather.size()][2];
		data[0][0] = "Dzien";
		data[0][1] = "Temperatura";
		for (int i = 1; i < dailyWeather.size(); i++) {
			data[i][0] = formatter.format(new Date(dailyWeather.get(i).getDt()*1000));
			data[i][1] = dailyWeather.get(i).getTemp().getDay();
		}
		
		return data;
	}
	
	
}
