package com.example.WeatherApp.model.openweathermap.DailyWeather;

import java.util.List;

public class DailyWeather {

	private List<OpenWeatherMapData> daily;

	public List<OpenWeatherMapData> getDaily() {
		return daily;
	}

	public void setDaily(List<OpenWeatherMapData> daily) {
		this.daily = daily;
	}

	@Override
	public String toString() {
		return "DailyWeather [daily=" + daily + "]";
	}
	
	
	
	
}

