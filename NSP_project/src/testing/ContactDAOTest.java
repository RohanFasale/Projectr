package testing;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.ContactDAO;
import dao.ContactDAOImplementation;
import entities.Contact;

public class ContactDAOTest {


	ContactDAO contDAO = new ContactDAOImplementation();
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(contDAO!=null);
		System.out.println("Got the DAO : "+contDAO);

		Contact contObj = contDAO.selectContact("456289762312");
		
		System.out.println("Cont Obj : "+contObj);

		System.out.println("Test over...");
	}

}