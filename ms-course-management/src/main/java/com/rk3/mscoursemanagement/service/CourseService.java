package com.rk3.mscoursemanagement.service;

import java.util.List;

import com.rk3.mscoursemanagement.model.Course;
import com.rk3.mscoursemanagement.model.Transaction;

public interface CourseService {

	
	public List<Course> allCourses();
	
	public Course findCourseById(Long courseId);
	
	public List<Transaction> findTransactionsOfUser(Long userId);
	
	public List<Transaction> findTransactionOfCourse(Long courseId);
	
	public Transaction saveTransaction(Transaction transaction);
}
