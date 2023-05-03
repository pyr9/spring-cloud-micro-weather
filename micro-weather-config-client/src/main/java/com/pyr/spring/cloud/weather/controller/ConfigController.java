package com.pyr.spring.cloud.weather.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

  @Value("${config.info}")
  private String info;

  @Value("${config.version}")
  private String version;

  @GetMapping("/config")
  public String config(){
    return "info: "+info+" version: "+version;
  }
}
