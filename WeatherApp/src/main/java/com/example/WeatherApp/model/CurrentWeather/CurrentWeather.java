package com.example.WeatherApp.model.CurrentWeather;

import java.util.ArrayList;

public class CurrentWeather {

	private main main;
	private clouds clouds;
	private wind wind;
	private ArrayList<weather> weather;


	public ArrayList<weather> getWeather() {
		return weather;
	}

	public void setWeather(ArrayList<weather> weather) {
		this.weather = weather;
	}

	public CurrentWeather() {

	}

	public main getMain() {
		return main;
	}

	public void setMain(main main) {
		this.main = main;
	}

	public clouds getClouds() {
		return clouds;
	}

	public void setClouds(clouds clouds) {
		this.clouds = clouds;
	}

	public wind getWind() {
		return wind;
	}

	public void setWind(wind wind) {
		this.wind = wind;
	}

	@Override
	public String toString() {

		return main + "\n" + clouds + "\n" + wind + "\n" + weather;
	}

}
