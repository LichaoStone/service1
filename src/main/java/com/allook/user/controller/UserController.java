package com.allook.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
//	@Autowired
//	private IUserService userService;
	
	@RequestMapping("/getUser")
    @ResponseBody
	public String index() {
    	return "I am Service1... ...(UserService)";
    }
	
//	@RequestMapping("/test/{fallBack}")
//    @HystrixCommand(fallbackMethod="helloFallbackMethod")/*调用方式失败后调用helloFallbackMethod*/
//    public String hello(@PathVariable("fallBack") String fallBack){
//        String rsString=userService.Hello(fallBack);
//        System.out.println("调用服务结果为："+rsString);
//        return "调用服务结果为："+rsString;
//    }
	
}
