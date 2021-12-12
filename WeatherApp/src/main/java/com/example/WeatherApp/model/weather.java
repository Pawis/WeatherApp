package com.example.WeatherApp.model;

public class weather {

	private String description;

	public weather() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "weather [description=" + description + "]";
	}

}
