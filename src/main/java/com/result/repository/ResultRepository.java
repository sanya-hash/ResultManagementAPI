package com.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.result.entity.Result;


@Repository
public interface ResultRepository  extends JpaRepository<Result, Long>{
	
	@Query("SELECT s FROM Result s WHERE s.rollno = :roll AND s.name = :name")
    Result findByRollAndName(Long roll, String name);
}
