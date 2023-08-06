package service;

import java.util.List;
import entities.SNO;
import dao.SNODAO;
import dao.SNODAOImplementation;
public class SNOServiceImplementation implements SNOService{
		SNODAO snoDao=new SNODAOImplementation();
	
	public void createSNOService(SNO sno) {
		snoDao.insertSNO(sno);
	}

	
	public SNO findSNOService(String username) {
		return snoDao.selectSNO(username);
	}

	public List<SNO> findSNOService() {
		return snoDao.selectSNOs();
	}

	public void modifySNOService(SNO dept) {
		snoDao.updateSNO(dept);
		
	}

}