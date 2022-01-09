package com.example.WeatherApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.WeatherApp.model.TomorrowIo.DailyWeather.Root;
import com.example.WeatherApp.model.TomorrowIo.DailyWeather.data;
import com.example.WeatherApp.model.TomorrowIo.DailyWeather.timelines;

@RestController
@PropertySource("ApiKeys.properties")
public class TomorrowIoRestController {

		String requestPath = "https://api.tomorrow.io/v4/";
	
		@Autowired
		private WebClient.Builder webClientBuilder;
		
		@Autowired
		private Environment env;
		
		public List<timelines> getDailyWeather(String lat, String lon) {
			
			WebClient webClient = webClientBuilder
					.baseUrl(requestPath)
					.build();
			
		return  webClient.get()
				.uri(UriBuilder -> UriBuilder
					.path("timelines")
					.queryParam("location",lat + "," + lon)
					.queryParam("fields", "temperature")
					.queryParam("timesteps", "1d")
					.queryParam("units", "metric")
					.queryParam("apikey", env.getProperty("TomorrowIoApiKey"))
					.build())
				.retrieve()
				.bodyToMono(Root.class)
				.map(Root::getData)
				.map(data::getTimelines)
				.block();
		}
}
