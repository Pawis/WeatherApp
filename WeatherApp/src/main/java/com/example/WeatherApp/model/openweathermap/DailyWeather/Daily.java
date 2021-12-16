package com.example.WeatherApp.model.openweathermap.DailyWeather;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Daily {

	private String dt;
	private Temp temp;
	private int pressure;
	private List<Weather> weather;
	
	@JsonGetter("dt")
	public String getDt() {
		return dt;
	}
	@JsonSetter("dt")
	public void setDt(long dt) {
		this.dt = Instant.ofEpochMilli(dt*1000).atZone(ZoneId.systemDefault()).toLocalDate().format(DateTimeFormatter.ofPattern("EEEE"));
	}


	public Temp getTemp() {
		return temp;
	}

	public void setTemp(Temp temp) {
		this.temp = temp;
	}


	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}


	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

}
