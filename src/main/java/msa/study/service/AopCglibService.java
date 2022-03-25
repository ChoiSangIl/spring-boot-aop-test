package msa.study.service;

import org.springframework.stereotype.Service;

import msa.study.LogExecutionTime;

@Service
public class AopCglibService {

	@LogExecutionTime
	public String test() {
		return "cglib test";
	}

}
