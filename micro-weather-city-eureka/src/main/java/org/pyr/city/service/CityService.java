package org.pyr.city.service;


import org.pyr.city.mapper.CityMapper;
import org.pyr.city.model.City;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityService {

    @Resource
    private CityMapper cityMapper;

    public List<City> getAll() {
        return cityMapper.getAll();
    }
}
