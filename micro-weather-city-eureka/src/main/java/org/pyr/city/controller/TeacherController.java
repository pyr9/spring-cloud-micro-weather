package org.pyr.city.controller;

import org.pyr.city.model.Teacher;
import org.pyr.city.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TeacherController {
    @Resource
    TeacherService service;

    @RequestMapping("/teachers")
    @ResponseBody
    public List<Teacher> cities() {
        return service.getAll();
    }
}
