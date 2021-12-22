package com.example.WeatherApp.model.weatherbit.DailyWeather;

import java.util.List;

public class Root{
	
    private List<WeatherBitData> data;
    
	public List<WeatherBitData> getData() {
		return data;
	}
	public void setData(List<WeatherBitData> data) {
		this.data = data;
	}
    
    
}

