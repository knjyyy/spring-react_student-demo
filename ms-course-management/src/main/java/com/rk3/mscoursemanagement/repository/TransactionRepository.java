package com.rk3.mscoursemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk3.mscoursemanagement.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	List<Transaction> findAllByUserId(Long userId);
	
	List<Transaction> findAllByCourseId(Long courseId);
}
