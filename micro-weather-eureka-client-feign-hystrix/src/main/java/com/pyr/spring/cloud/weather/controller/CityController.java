package com.pyr.spring.cloud.weather.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pyr.spring.cloud.weather.service.CityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
  @Autowired
  private CityClient cityClient;

  @RequestMapping("/cities")
//  @HystrixCommand(fallbackMethod="defaultCities")
  public String listCity(){
    return cityClient.listCity();
  }

//  public String defaultCities(){
//    return "Micro weather city eureka is down!";
//  }
}
