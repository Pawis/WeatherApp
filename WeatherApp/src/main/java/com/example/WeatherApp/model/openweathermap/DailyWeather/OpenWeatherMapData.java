package com.example.WeatherApp.model.openweathermap.DailyWeather;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class OpenWeatherMapData {

	private String dt;
	private Temp temp;
	private int pressure;
	private List<Weather> weather;
	
	public String getDt() {
		return dt;
	}
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
