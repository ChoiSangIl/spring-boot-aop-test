package msa.study.service.impl;

import org.springframework.stereotype.Service;

import msa.study.LogExecutionTime;
import msa.study.service.AopProxyService;

@Service
public class AopProxyServiceImpl implements AopProxyService{

	@Override
	@LogExecutionTime
	public String test() {
		return "proxyTest";
	}

}
