package com.pyr.spring.cloud.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
public class CityController {

  @Autowired
  private RestTemplate restTemplate;

  //面向微服务编程，即通过微服务的名称来获取调用地址
  private static final String REST_URL_PREFIX = "http://micro-weather-city-eureka";

  @RequestMapping("/cities")
  public String listCity(){
    return restTemplate.getForObject(REST_URL_PREFIX + "/cities", String.class);
  }
}
