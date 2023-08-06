package service;

import java.util.List;

import entities.Contact;

public interface ContactService {
	void createContactService(Contact dept);
	Contact findContactService(String aadharNumber);
	void modifyContactService(Contact dept);
	List<Contact> findContactService();
}
