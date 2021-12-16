package com.example.WeatherApp.config;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

@Configuration
public class CaffeineCacheConfig {

	@Bean
	public CacheManager cacheManager() {
		CaffeineCacheManager cacheManager = new CaffeineCacheManager("weather");
		cacheManager.setCaffeine(caffeineCacheBuilder());
		return cacheManager;
	}
	
	Caffeine <Object,Object>  caffeineCacheBuilder() {
		return Caffeine.newBuilder()
				.initialCapacity(10)
				.maximumSize(20)
				.expireAfterAccess(10,TimeUnit.MINUTES)
				.recordStats();
	}
}
