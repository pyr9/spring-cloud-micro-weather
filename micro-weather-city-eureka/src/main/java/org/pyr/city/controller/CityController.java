package org.pyr.city.controller;

import org.pyr.city.model.City;
import org.pyr.city.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CityController {
    @Resource
    CityService cityService;

    @RequestMapping("/cities")
    @ResponseBody
    public List<City> cities() {
        return cityService.getAll();
    }
}
