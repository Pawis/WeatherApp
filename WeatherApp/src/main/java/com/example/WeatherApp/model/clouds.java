package com.example.WeatherApp.model;

public class clouds {

	private String all;

	public clouds(String all) {
		this.all = all;
	}

	
	
	public clouds() {
	}



	public String getAll() {
		return all;
	}



	public void setAll(String all) {
		this.all = all;
	}



	@Override
	public String toString() {
		return "clouds [all=" + all + "]";
	}
	
	
}
