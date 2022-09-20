package com.user.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.entity.Contact;



//@FeignClient(name = "contact-details",url = "localhost:8082/contact")  // when running this remove contact from getmapping
@FeignClient(name = "contact-details")
public interface UserProxy {
	
	@GetMapping("contact/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId);
	

}
