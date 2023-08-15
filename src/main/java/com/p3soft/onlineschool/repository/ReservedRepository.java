package com.p3soft.onlineschool.repository;

import com.p3soft.onlineschool.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservedRepository extends CrudRepository<Course, Long> {
    List<Course> findCourseById(long id);
}
