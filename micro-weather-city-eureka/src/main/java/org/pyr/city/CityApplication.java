package org.pyr.city;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"org.pyr.city.**"})
public class CityApplication {

  public static void main(String[] args) {
    SpringApplication.run(CityApplication.class, args);
  }

}
