package Logic;

import java.sql.SQLException;

public class askToMoteeveController {
	
	public AskToMoteeveMotPhrBean randomMotivationalPhrase() {
		
		motivationalPhraseDAOJDBC dao = new motivationalPhraseDAOJDBC() ; //istanzio il DAO 
		motivationalPhrase motPhr = new motivationalPhrase() ; //istanzio il nuovo oggeto motivational phrase
		
		try {
			 motPhr = dao.generateMotivationalPhrase() ; //si chiama il metodo del DAO che restituisce una motivational phrase
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		AskToMoteeveMotPhrBean bean = new AskToMoteeveMotPhrBean(); //istanzio il bean 
		
		bean.setBean(motPhr.getPhrase()); //metto nel bean il dato da passare
		
		return bean ;
	}
	
}