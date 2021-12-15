package com.example.WeatherApp.model.openweathermap.DailyWeather;

import java.util.List;

public class DailyWeather {

	private List<Daily> daily;

	public List<Daily> getDaily() {
		return daily;
	}

	public void setDaily(List<Daily> daily) {
		this.daily = daily;
	}

	@Override
	public String toString() {
		return "DailyWeather [daily=" + daily + "]";
	}
	
	
	
	
}

