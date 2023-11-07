package org.pyr.city.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pyr.city.model.Teacher;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface TeacherMapper extends BaseMapper<Teacher> {

    List<Teacher> getAll();

}