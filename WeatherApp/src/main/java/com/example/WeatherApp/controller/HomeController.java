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
	public String getDailyWeather(Model model) {
		
		List<Daily> dailyWeather =  weatherService.getDailyWeather();
		Object[][] dailyWeatherChart = weatherService.getDailyWeatherChart();
				
		System.out.println(dailyWeather);
			    
		System.out.println(Arrays.deepToString(dailyWeatherChart).replace("], ", "]\n"));
		model.addAttribute("daily", dailyWeather);
		model.addAttribute("array", dailyWeatherChart);
		
		return "weather";
	}

	@GetMapping("/chart")
	public String chartPage(Model model, @RequestParam String city) {
		List<Daily> weather = weatherService.getDailyWeather();
		
		model.addAttribute("weather", weather);

		return "chart";
	}
}
