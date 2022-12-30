package Logic;

public class motivationalPhrase { 					//Entity
	
	private String phrase; 
	
	public motivationalPhrase() {					//costruttore di default
	}
	
	public motivationalPhrase (String phrase) { 	//costruttore
		this.phrase = phrase;
	}

	public String getPhrase() { 					//getter
		return phrase;
	}
	
}
