package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list= List.of(
			new Contact(10L, "amit@gmail.com", "Amit", 1L),
            new Contact(20L, "anil@gmail.com", "Anil", 1L),
            new Contact(30L, "rohan@gmail.com", "Rohan", 2L),
            new Contact(40L, "sameer@gmail.com", "Sameer", 3L));
	
	
	@Override
	public List<Contact> getContact(Long userId) {
		
		return list.stream().filter(contact ->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
