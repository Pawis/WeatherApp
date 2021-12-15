package com.example.WeatherApp.model.weatherbit.DailyWeather;

import java.util.List;

public class Root{
    private List<Data> data;
    private String city_name;
    private double lon;
    private String timezone;
    private double lat;
    private String country_code;
    private String state_code;
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
    
    
}

