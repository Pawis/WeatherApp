package com.example.WeatherApp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.WeatherApp.model.WeatherDTO;

import reactor.core.publisher.Mono;


@RestController
public class WeatherRestController {

	String cos = "https://api.openweathermap.org/data/2.5/weather?q=Warsaw&appid=f8d05f7b1b87f78ef2dd1e67043aeb15";
	String requestUri = "https://api.openweathermap.org/data/2.5";

	String apiKey = "f8d05f7b1b87f78ef2dd1e67043aeb15";
	
	WebClient client = WebClient
			.builder()
			.baseUrl(requestUri)
			.build();
	
	public WeatherDTO getCurrentWeather(String city) {
		return client.get()
		.uri(uriBuilder -> uriBuilder 
				.path("/weather")
				.queryParam("q", city)
				.queryParam("appid", apiKey)
				.queryParam("units", "metric")
				.build())
		.retrieve()
		.bodyToMono(WeatherDTO.class)
		.block();
		
		
	}
	
}


