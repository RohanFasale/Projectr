package dao;
import java.util.List;

//import entities.Contact;
import entities.Scholarship;

public interface ScholarshipDAO {
	public void insertContact(Scholarship scholarship);
	public Scholarship selectContact(String aadaharNumber);
	public List<Scholarship> selectScholarships();
	public void updateScholarship(Scholarship scholarship);
}
