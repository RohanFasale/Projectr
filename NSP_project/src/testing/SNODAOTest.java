package testing;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.SNODAO;
import dao.SNODAOImplementation;
import entities.SNO;

public class SNODAOTest {


	SNODAO snoDAO = new SNODAOImplementation();
	
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(snoDAO!=null);
		System.out.println("Got the DAO : "+snoDAO);

		SNO snoObj = snoDAO.selectSNO("");
		
		System.out.println("SNO Obj : "+snoObj);

		System.out.println("Test over...");
	}

}