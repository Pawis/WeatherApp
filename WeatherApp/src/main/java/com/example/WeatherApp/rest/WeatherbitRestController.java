package com.example.WeatherApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.WeatherApp.model.weatherbit.DailyWeather.Data;
import com.example.WeatherApp.model.weatherbit.DailyWeather.Root;

@RestController
public class WeatherbitRestController {

	String requestUri = "http://api.weatherbit.io/v2.0/forecast";
	
	String apiKey = "d382eab11426403d9cc616cff20f1d45";

	@Autowired
	private WebClient.Builder webClientBuilder;

	public List<Data> getDailyWeather() {

		WebClient webclient = webClientBuilder
				.baseUrl(requestUri)
				.build();
		
		return webclient.get()
		.uri(uriBuilder -> uriBuilder
				.path("/daily")
				.queryParam("key", apiKey)
				.queryParam("days", "7")
				.queryParam("lat", "49.1794")
				.queryParam("lon", "20.0881")
				.build())
		.retrieve()
		.bodyToMono(Root.class)
		.map(Root::getData)
		.block();
	}

}
