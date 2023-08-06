package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Contact;
import entities.Scholarship;

public class ScholarshipDAOImplementation {
	public ScholarshipDAOImplementation() {
		super();
	}
	
	public void insertScholarship(Scholarship scholarship) {
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO CONTACT VALUES (?,?,?,?)");
			
			
			pst.setString(1, scholarship.getAadharNumber());
			pst.setString(2, scholarship.getNTSC());
			pst.setString(3, scholarship.getPragati());
			pst.setString(4, scholarship.getPMS());
			
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement 
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Scholarship selectScholarship(String aadharNumber) {
		Scholarship scholarship =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement 
			ResultSet result = statement.executeQuery("SELECT * FROM CONTACT WHERE AADHAR_NUMBER=contact.getAadharNumber()");
			
			//5. process the result if any
			if(result.next()) {
				scholarship = new Scholarship(); //blank object
				
				scholarship.setAadharNumber(result.getString(1));
				scholarship.setNTSC(result.getString(2));
				scholarship.setPragati(result.getString(3));
				scholarship.setPMS(result.getString(4));
				

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scholarship;
	}
	
	public List<Scholarship> selectScholarships() {
		// TODO Auto-generated method stub
		List<Scholarship> scholarshipList = new ArrayList<Scholarship>();
		try {
			
			Statement statement = conn.createStatement();
			//System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM SCHOLARSHIP");
			
			//5. process the result if any
			while(result.next()) {
				Scholarship scholarship = new Scholarship(); //blank object
				
				scholarship.setAadharNumber(result.getString(1));
				scholarship.setNTSC(result.getString(2));
				scholarship.setPragati(result.getString(3));
				scholarship.setPMS(result.getString(4));
				
				scholarshipList.add(scholarship); // add this object to the LIST 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scholarshipList;
	}

	public void updateScholarship(Scholarship scholarship) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = 
					conn.prepareStatement("UPDATE SCHOLARSHIP set NTSC=?,Pragati=?,PMS=?, where aadhar_number=?");
			
			
			pst.setString(1, scholarship.getAadharNumber());
			pst.setString(2, scholarship.getNTSC());
			pst.setString(3, scholarship.getPragati());
			pst.setString(4,scholarship.getPMS());
			
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Row MODIFIED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
