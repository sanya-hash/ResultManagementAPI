package com.result.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.result.entity.Result;
import com.result.service.ResultService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/result")
public class ResultController {
	@Autowired
	private ResultService resultService;
	
	@PostMapping("")
	public ResponseEntity<Result> addResult(@RequestBody Result result) {
		result = resultService.addResult(result);
		return ResponseEntity.ok(result);
		
	}
	
	@GetMapping("")
	public List<Result> getAllResults(){
		return this.resultService.getAllResult();
	}
	@GetMapping("/{rollnumber}")
	public Result getResult(@PathVariable Long rollnumber) {
		return this.resultService.getResult(rollnumber); 
	}
	
	@DeleteMapping("/{rollno}")
	public void deleteResult(@PathVariable Long rollno) {
		resultService.deleteResult(rollno);
	}
	
	@PutMapping("")
	public Result updateResult(@RequestBody Result result) throws Exception {
	    return resultService.updateResult(result);
	}
	
}
