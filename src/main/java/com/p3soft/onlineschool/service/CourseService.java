package com.p3soft.onlineschool.service;

import com.p3soft.onlineschool.model.Course;
import com.p3soft.onlineschool.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    CourseRepository courseRepository;
    public List<Course> getAllCourse(){
        return new ArrayList<>(courseRepository.findAll());
    }
}
