package com.pyr.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

  @RequestMapping("/hello")
  public String hello() {
    return "hello World!";
  }
}
