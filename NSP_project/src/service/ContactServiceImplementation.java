package service;

import java.util.List;
import entities.Contact;
import dao.ContactDAO;
import dao.ContactDAOImplementation;
public class ContactServiceImplementation implements ContactService{
		ContactDAO contDao=new ContactDAOImplementation();
	@Override
	public void createContactService(Contact contact) {
		contDao.insertContact(contact);
	}

	@Override
	public Contact findContactService(String aadharNumber) {
		return contDao.selectContact(aadharNumber);
	}

	@Override
	public List<Contact> findContactService() {
		return contDao.selectContacts();
	}

	@Override
	public void modifyContactService(Contact dept) {
		contDao.updateContact(dept);
		
	}

}