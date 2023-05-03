package com.pyr.spring.cloud.weather.service;

import org.springframework.stereotype.Component;

@Component
public class CityClientFallBack implements CityClient{
  @Override
  public String listCity() {
    return "City is empty!";
  }
}
