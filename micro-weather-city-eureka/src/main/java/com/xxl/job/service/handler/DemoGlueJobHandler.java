package com.xxl.job.service.handler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.IJobHandler;
import org.pyr.city.model.City;
import org.pyr.city.model.Teacher;
import org.pyr.city.service.CityService;
import org.pyr.city.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DemoGlueJobHandler extends IJobHandler {
    @Autowired
    CityService cityService;

    @Autowired
    TeacherService teacherService;

    @Override
    public void execute() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World.");
        List<City> cities = cityService.getAll();
        System.out.println("cities id: " + cities.get(0).getId());
        System.out.println("cities name: " + cities.get(0).getName());

        List<Teacher> teachers = teacherService.getAll();
        System.out.println("teachers name: " + teachers.get(0).getName());
        XxlJobHelper.log("XXL-JOB, END.");
    }
}
