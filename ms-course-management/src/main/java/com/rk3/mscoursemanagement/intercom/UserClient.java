package com.rk3.mscoursemanagement.intercom;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-service")
public interface UserClient {

	//@PostMapping(name="/service/names", consumes="application/json")
	@RequestMapping(method=RequestMethod.POST,value="/service/names",consumes="application/json")
	List<String> getUsernames(@RequestBody List<Long> userIdList);
}
