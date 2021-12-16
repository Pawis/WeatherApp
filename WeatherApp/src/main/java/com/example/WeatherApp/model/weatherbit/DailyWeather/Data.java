package com.example.WeatherApp.model.weatherbit.DailyWeather;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data {
	private String datetime;
	private int temp;

	public String getDatetime() {
		return datetime;
	}
	
	public void setDatetime(String datetime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(datetime,formatter);
		this.datetime = date.atStartOfDay(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("EEEE"));
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

}