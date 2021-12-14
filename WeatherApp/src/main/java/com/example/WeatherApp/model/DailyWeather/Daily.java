package com.example.WeatherApp.model.DailyWeather;

import java.util.List;

public class Daily {

	private long dt;
	private int sunrise;
	private int sunset;
	private int moonrise;
	private int moonset;
	private double moon_phase;
	private Temp temp;
	private FeelsLike feels_like;
	private int pressure;
	private int humidity;
	private double dew_point;
	private double wind_speed;
	private int wind_deg;
	private double wind_gust;
	private List<Weather> weather;
	private int clouds;
	private int pop;
	private double uvi;

	@Override
	public String toString() {
		return "Daily [dt=" + dt + ", sunrise=" + sunrise + ", sunset=" + sunset + ", moonrise=" + moonrise
				+ ", moonset=" + moonset + ", moon_phase=" + moon_phase + ", temp=" + temp + ", feels_like="
				+ feels_like + ", pressure=" + pressure + ", humidity=" + humidity + ", dew_point=" + dew_point
				+ ", wind_speed=" + wind_speed + ", wind_deg=" + wind_deg + ", wind_gust=" + wind_gust + ", weather="
				+ weather + ", clouds=" + clouds + ", pop=" + pop + ", uvi=" + uvi + "]";
	}

	public long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public int getSunrise() {
		return sunrise;
	}

	public void setSunrise(int sunrise) {
		this.sunrise = sunrise;
	}

	public int getSunset() {
		return sunset;
	}

	public void setSunset(int sunset) {
		this.sunset = sunset;
	}

	public int getMoonrise() {
		return moonrise;
	}

	public void setMoonrise(int moonrise) {
		this.moonrise = moonrise;
	}

	public int getMoonset() {
		return moonset;
	}

	public void setMoonset(int moonset) {
		this.moonset = moonset;
	}

	public double getMoon_phase() {
		return moon_phase;
	}

	public void setMoon_phase(double moon_phase) {
		this.moon_phase = moon_phase;
	}

	public Temp getTemp() {
		return temp;
	}

	public void setTemp(Temp temp) {
		this.temp = temp;
	}

	public FeelsLike getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(FeelsLike feels_like) {
		this.feels_like = feels_like;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public double getDew_point() {
		return dew_point;
	}

	public void setDew_point(double dew_point) {
		this.dew_point = dew_point;
	}

	public double getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}

	public int getWind_deg() {
		return wind_deg;
	}

	public void setWind_deg(int wind_deg) {
		this.wind_deg = wind_deg;
	}

	public double getWind_gust() {
		return wind_gust;
	}

	public void setWind_gust(double wind_gust) {
		this.wind_gust = wind_gust;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public int getClouds() {
		return clouds;
	}

	public void setClouds(int clouds) {
		this.clouds = clouds;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

	public double getUvi() {
		return uvi;
	}

	public void setUvi(double uvi) {
		this.uvi = uvi;
	}

}
