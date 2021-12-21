package com.example.WeatherApp.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.WeatherApp.model.openweathermap.DailyWeather.Daily;
import com.example.WeatherApp.service.OpenWeatherMapServiceImpl;


@Controller
public class HomeController {

	@Autowired
	private OpenWeatherMapServiceImpl weatherService;

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/weather")
	public String getDailyWeather(Model model, @RequestParam(value = "lat", required = false, defaultValue = "49.1794") String lat,
			@RequestParam(value = "lon", required = false, defaultValue = "20.0881") String lon) {
		
		List<Daily> dailyWeather =  weatherService.getDailyWeather(lat,lon);
		Object[][] dailyWeatherChart = weatherService.getDailyWeatherChart(lat,lon);
				
		System.out.println(dailyWeather);
			    
		System.out.println(Arrays.deepToString(dailyWeatherChart).replace("], ", "]\n"));
		model.addAttribute("daily", dailyWeather);
		model.addAttribute("array", dailyWeatherChart);
		
		return "weather";
	}
	
}
