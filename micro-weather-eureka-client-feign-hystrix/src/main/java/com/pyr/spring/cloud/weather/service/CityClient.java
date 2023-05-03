package com.pyr.spring.cloud.weather.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(name="micro-weather-city-eureka")
//public interface CityClient {
//  @RequestMapping("/cities")
//  String listCity();
//}

@FeignClient(name="micro-weather-city-eureka", fallback = CityClientFallBack.class)
public interface CityClient {
  @RequestMapping("/cities")
  String listCity();
}
