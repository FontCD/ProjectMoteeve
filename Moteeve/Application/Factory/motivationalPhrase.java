package Factory;

import java.sql.SQLException;

public class motivationalPhrase { 					//Entity
	
	private String script; 
	
	
	
	public motivationalPhrase() {					//costruttore di default
	}
	
	public void setMotivationalPhrase (String script) { 	//costruttore
		this.script = script;
	}

	public String getPhrase() { 					//getter
		return script;
	}
	
	public motivationalPhrase generateMotivationalPhrase(int index) throws SQLException {
		motivationalPhraseDAOJDBC dao = new motivationalPhraseDAOJDBC(); 
		motivationalPhrase motPh = dao.randomMotivationalPhrase(index) ; 
		
		return motPh;
		
	}
}
