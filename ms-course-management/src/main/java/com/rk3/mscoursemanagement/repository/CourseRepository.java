package com.rk3.mscoursemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk3.mscoursemanagement.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
