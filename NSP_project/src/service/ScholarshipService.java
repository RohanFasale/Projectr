package service;

import java.util.List;

import entities.Scholarship;

public interface ScholarshipService {
	void createScholarshipService(Scholarship dept);
	Scholarship findScholarshipService(String aadharNumber);
	void modifyScholarshipService(Scholarship dept);
	List<Scholarship> findScholarshipService();
}
