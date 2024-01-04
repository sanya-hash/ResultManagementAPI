package com.result.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.result.entity.Result;

import com.result.repository.ResultRepository;
import com.result.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService {
	
	@Autowired
	private ResultRepository resultRepository;
	
	@Override
	public Result addResult(Result student) {
		// TODO Auto-generated method stub
		return resultRepository.save(student);
		
	}

	@Override
	public Result getResult(Long rollno) {
		return resultRepository.findById(rollno).get();
	
	}

	@Override
	public void deleteResult(Long rollno) {
		// TODO Auto-generated method stub
		
		resultRepository.deleteById(rollno);
	}

	@Override
	public Result updateResult(Result result) throws Exception {
		// TODO Auto-generated method stub
		Result isExisted = resultRepository.findById(result.getRollno()).get();
		if(isExisted.getRollno().equals(result.getRollno())) {
		  return resultRepository.save(result);
		}
		else {
			throw new Exception("not updated");
		}
	}
	
	@Override
	public List<Result> getAllResult(){
		return resultRepository.findAll();
	}

	@Override
	public Result saveData(Result result) {
		// TODO Auto-generated method stub
		return resultRepository.save(result);
	}



}
