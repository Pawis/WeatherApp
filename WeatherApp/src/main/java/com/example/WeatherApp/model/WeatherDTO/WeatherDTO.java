package com.example.WeatherApp.model.WeatherDTO;

public class WeatherDTO {
	
	private int temp;
	private long date;
	private int pressure;
	
	public WeatherDTO(int temp, long date, int pressure) {
		this.temp = temp;
		this.date = date;
		this.pressure = pressure;
	}
	
	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	
	
}
