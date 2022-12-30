package Logic;

import java.sql.SQLException;

public class askToMoteeveController {
	
	public void randomMotivationalPhrase() {
		
		String index ; 
		
		motivationalPhraseDAOJDBC dao = new motivationalPhraseDAOJDBC() ; 							//istanzio il DAO 
		motivationalPhrase motPhr = new motivationalPhrase() ; 										//creao una nuova istanza della classe motivational phrase dal costruttore di default								
		
		index = choosePhrase() ;   
		
		
		try {
			motPhr = dao.generateMotivationalPhrase(index) ; 										//si chiama il metodo del DAO che restituisce una motivational phrase
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		AskToMoteeveMotPhrBean.setBean(motPhr.getPhrase()); 										//metto nel bean il dato da passare
		
	}
	
	
	private String choosePhrase() {
		String index ; 																				
		
		askToMoteeveMoteeveBoundary MotBD = new askToMoteeveMoteeveBoundary() ; 					//creo una istanza della MoteeveBoundary
		MotBD.giveIndex() ; 																		//chiedo alla boundary un indice che verrà messo nel bean 
		
		index = askToMoteeveIndexBean.getBean(); 													//prendo il parametro dal bean 
		
		return index ; 
	}
	
	
}