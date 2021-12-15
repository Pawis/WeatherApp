package com.example.WeatherApp.model.weatherbit.DailyWeather;

public class Data{
    private int moonrise_ts;
    private String wind_cdir;
    private int rh;
    private double pres;
    private double high_temp;
    private int sunset_ts;
    private double ozone;
    private double moon_phase;
    private double wind_gust_spd;
    private double snow_depth;
    private int clouds;
    private int ts;
    private int sunrise_ts;
    private double app_min_temp;
    private double wind_spd;
    private int pop;
    private String wind_cdir_full;
    private double slp;
    private double moon_phase_lunation;
    private String valid_date;
    private double app_max_temp;
    private double vis;
    private double dewpt;
    private double snow;
    private double uv;
    private Weather weather;
    private int wind_dir;
    private Object max_dhi;
    private int clouds_hi;
    private double precip;
    private double low_temp;
    private double max_temp;
    private int moonset_ts;
    private String datetime;
    private double temp;
    private double min_temp;
    private int clouds_mid;
    private int clouds_low;
    
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
    
    
}