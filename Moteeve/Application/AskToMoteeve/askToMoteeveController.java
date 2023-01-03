package AskToMoteeve;

import java.sql.SQLException;

import Factory.motivationalPhrase;

public class askToMoteeveController {
	
	public AskToMoteeveMotPhrBean randomMotivationalPhrase() {
		
		int index ;  																			//istanzio il DAO 
		motivationalPhrase motPhr = new motivationalPhrase() ; 										//creao una nuova istanza della classe motivational phrase dal costruttore di default								
		
		index = choosePhrase() ;   
		
		
		try {
			 motPhr = motPhr.generateMotivationalPhrase(index); 													//si chiama il metodo del DAO che restituisce una motivational phrase
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		AskToMoteeveMotPhrBean bean = new AskToMoteeveMotPhrBean() ; 
		bean.setBean(motPhr.getPhrase()); 										//metto nel bean il dato da passare
		
		return bean; 
	}
	
	
	private int choosePhrase() {
		int index ; 																				
		
		askToMoteeveMoteeveBoundary MotBD = new askToMoteeveMoteeveBoundary() ; 					//creo una istanza della MoteeveBoundary
		askToMoteeveIndexBean bean = MotBD.giveIndex() ; 																		//chiedo alla boundary un indice che verrà messo nel bean  
		index = bean.getBean(); 													//prendo il parametro dal bean 
		
		return index ; 
	}
	
	
}