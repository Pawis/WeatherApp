package com.example.WeatherApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.WeatherApp.model.weatherbit.DailyWeather.Data;
import com.example.WeatherApp.model.weatherbit.DailyWeather.Root;

@RestController
@PropertySource("ApiKeys.properties")
public class WeatherbitRestController {

	String requestUri = "http://api.weatherbit.io/v2.0/forecast";
	
	@Autowired
	private Environment env;
	
	@Autowired
	private WebClient.Builder webClientBuilder;

	public List<Data> getDailyWeather() {

		WebClient webclient = webClientBuilder
				.baseUrl(requestUri)
				.build();
		
		return webclient.get()
		.uri(uriBuilder -> uriBuilder
				.path("/daily")
				.queryParam("key", env.getProperty("WeatherbitApiKey"))
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
