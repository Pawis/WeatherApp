package com.example.WeatherApp.model.CurrentWeather;


public class wind {

	private String speed;
	private String deg;
	private String gust;

	@Override
	public String toString() {
		return "wind [speed=" + speed + ", deg=" + deg + ", gust=" + gust + "]";
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public String getGust() {
		return gust;
	}

	public void setGust(String gust) {
		this.gust = gust;
	}

}
