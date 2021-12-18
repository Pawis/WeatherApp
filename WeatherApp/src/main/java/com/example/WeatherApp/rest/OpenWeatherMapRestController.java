package com.example.WeatherApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.WeatherApp.model.openweathermap.DailyWeather.Daily;
import com.example.WeatherApp.model.openweathermap.DailyWeather.DailyWeather;


@RestController
@PropertySource("ApiKeys.properties")
public class OpenWeatherMapRestController {

	// "lat", "49.1794"
	// "lon", "20.0881"
	String requestUri = "https://api.openweathermap.org/data/2.5";

	@Autowired
	private Environment env;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	
	public List<Daily> getDailyWeather(String lat, String lon) {
		
		WebClient webClient = webClientBuilder
				.baseUrl(requestUri)
				.build();
		
		return webClient.get()
				.uri(uriBuilder -> uriBuilder
						.path("/onecall")
						.queryParam("lat", lat)
						.queryParam("lon", lon)
						.queryParam("exclude", "minutely")
						.queryParam("units", "metric")
						.queryParam("appid", env.getProperty("OpenWeatherMapApiKey"))
						.build())
				.retrieve()
				.bodyToMono(DailyWeather.class)
				//.map(s -> s.daily)
				.map(DailyWeather::getDaily)
				.block();
	}
	
	
}


