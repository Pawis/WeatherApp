package com.example.WeatherApp.model.DailyWeather;

import java.util.List;

public class DailyWeather {

	public List<Daily> daily;

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
