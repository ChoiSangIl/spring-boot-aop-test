package msa.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import msa.study.service.AopCglibService;
import msa.study.service.AopProxyService;

@Controller
public class AopTestController {
	
	@Autowired
	AopCglibService cglibService;
	
	@Autowired
	AopProxyService aopProxyService;
	
	@ResponseBody
	@GetMapping("/cglib/test")
	private String aopTest() {
		System.out.println(cglibService.getClass());
		return cglibService.test();
	}
	
	@ResponseBody
	@GetMapping("/proxy/test")
	private String proxyTest() {
		System.out.println(aopProxyService.getClass());
		return aopProxyService.test();
	}

}
