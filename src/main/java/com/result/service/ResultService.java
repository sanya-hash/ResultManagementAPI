package com.result.service;

import java.util.List;

import com.result.entity.Result;



public interface ResultService {
	Result addResult(Result result);
	Result getResult(Long rollno);
	void deleteResult(Long rollno);
	Result updateResult(Result result) throws Exception;
	List<Result> getAllResult();
	
	Result saveData(Result result );
}
