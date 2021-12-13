package com.example.WeatherApp.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.WeatherApp.model.CurrentWeather.CurrentWeather;
import com.example.WeatherApp.model.DailyWeather.Daily;
import com.example.WeatherApp.model.DailyWeather.DailyWeather;
import com.example.WeatherApp.service.WeatherService;


@Controller
public class HomeController {

	@Autowired
	private WeatherService weatherService;

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

	@GetMapping("/weather")
	public String getCurrentWeather(Model model, @RequestParam String city) {

		CurrentWeather weather = weatherService.getCurrentWeather(city);

		
		model.addAttribute("weather", weather);

		return "weather";

	}
	
	@GetMapping("/weather1")
	public String getDailyWeather(Model model) {
		
		List<Daily> dailyWeather =  weatherService.getDailyWeather();
		
		System.out.println(dailyWeather);
		
		model.addAttribute("daily", dailyWeather);
		
		return "weather";
	}
/*
	@GetMapping("/chart")
	public String chartPage(Model model, @RequestParam String city) {
		WeatherDTO weather = weatherService.getCurrentWeather(city);

		model.addAttribute("weather", weather);

		return "chart";
	}
*/
}
