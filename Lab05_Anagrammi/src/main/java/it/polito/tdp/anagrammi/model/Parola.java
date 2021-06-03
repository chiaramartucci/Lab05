package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class Parola {

	List <String> anagrammi = new ArrayList<String>();
	String parziale;
	
	public void cercaAnagrammi (String parola, int livello) {
		if (livello==Math.pow(2, parola.length())) {
			// caso terminale
			System.out.println(anagrammi);
		}
		
		else {
			for (int i=0; i<parola.length(); i++) {
				// controllo che non esista già l'anagramma 
				
				
					parziale.add(colonna);  
					cerca(parziale, livello+1);
					parziale.remove(parziale.size()-1); // backtracking
				
			}
		}
	}
	
}
