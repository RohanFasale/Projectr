package service;

import java.util.List;

import entities.SNO;

public interface SNOService {
	void createSNOService(SNO dept);
	SNO findSNOService(String username);
	void modifySNOService(SNO dept);
	List<SNO> findSNOService();
}
