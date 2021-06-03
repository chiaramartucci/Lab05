package it.polito.tdp.anagrammi.model;

import it.polito.tdp.anagrammi.DAO.ParolaDAO;

public class Model {

	private ParolaDAO parolaDao;

	
	
	public boolean getParolaTrovata (String parola) {
		return parolaDao.getParolaTrovata(parola);
	}
	
	
	

	
}
