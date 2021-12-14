package com.example.WeatherApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.WeatherApp.model.CurrentWeather.CurrentWeather;
import com.example.WeatherApp.model.DailyWeather.Daily;
import com.example.WeatherApp.model.DailyWeather.DailyWeather;

import reactor.core.publisher.Flux;



@RestController
public class WeatherRestController {

	String test = "https://api.openweathermap.org/data/2.5/weather?q=Warsaw&appid=f8d05f7b1b87f78ef2dd1e67043aeb15";
	
	String requestUri = "https://api.openweathermap.org/data/2.5";
	String dailyWeatherWarsaw = "https://api.openweathermap.org/data/2.5/onecall?lat=52.2298&lon=21.0118&exclude=minutely&appid=f8d05f7b1b87f78ef2dd1e67043aeb15";

	String apiKey = "f8d05f7b1b87f78ef2dd1e67043aeb15";
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	public CurrentWeather getCurrentWeather(String city) {
		
		
		
		WebClient webClient = webClientBuilder
				.baseUrl(requestUri)
				.build();
		
		return webClient.get()
		.uri(uriBuilder -> uriBuilder 
				.path("/weather")
				.queryParam("q", city)
				.queryParam("appid", apiKey)
				.queryParam("units", "metric")
				.build())
		.retrieve()
		.bodyToMono(CurrentWeather.class)
		.block();
		
		
	}
	
	public List<Daily> getDailyWeather() {
		
		WebClient webClient = webClientBuilder
				.baseUrl(requestUri)
				.build();
		
		return webClient.get()
				.uri(uriBuilder -> uriBuilder
						.path("/onecall")
						.queryParam("lat", "49.1794")
						.queryParam("lon", "20.0881")
						.queryParam("exclude", "minutely")
						.queryParam("units", "metric")
						.queryParam("appid", apiKey)
						.build())
				.retrieve()
				.bodyToFlux(DailyWeather.class)
				//.map(s -> s.daily)
				.map(DailyWeather::getDaily)
				.blockLast();
	}
	
	
}


