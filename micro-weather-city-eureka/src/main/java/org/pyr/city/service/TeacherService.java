package org.pyr.city.service;


import org.pyr.city.mapper.TeacherMapper;
import org.pyr.city.model.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService {

    @Resource
    private TeacherMapper mapper;

    public List<Teacher> getAll() {
        return mapper.getAll();
    }
}
