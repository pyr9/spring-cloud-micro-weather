package org.pyr.city.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pyr.city.model.City;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface CityMapper extends BaseMapper<City> {

    List<City> getAll();

}