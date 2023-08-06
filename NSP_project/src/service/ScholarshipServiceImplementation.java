package service;

import java.util.List;
import entities.Scholarship;
import dao.ScholarshipDAOImplementation;

public class ScholarshipServiceImplementation implements ScholarshipService{
		ScholarshipDAOImplementation scholarshipDao=new ScholarshipDAOImplementation();
	
	public void createScholarshipService(Scholarship scholarship) {
		scholarshipDao.insertScholarship(scholarship);
	}

	
	public Scholarship findScholarshipService(String aadharNumber) {
		return scholarshipDao.selectScholarship(aadharNumber);
	}

	
	public List<Scholarship> findScholarshipService() {
		return scholarshipDao.selectScholarships();
	}

	
	public void modifyScholarshipService(Scholarship dept) {
		scholarshipDao.updateScholarship(dept);
		
	}

}