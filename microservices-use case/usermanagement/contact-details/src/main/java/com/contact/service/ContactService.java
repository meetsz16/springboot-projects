package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;

public interface ContactService {

	List<Contact> getContact(Long userId);
	
}
