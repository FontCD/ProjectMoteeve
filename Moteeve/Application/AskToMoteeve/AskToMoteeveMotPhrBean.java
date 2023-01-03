package AskToMoteeve;

public class AskToMoteeveMotPhrBean {						//bean per il passaggio frase da stampare 
	
	private String phrase ; 					
	
	public void setBean(String newphrase) {					//setter
		phrase = newphrase ; 
	}
	
	public String getBean() {								//getter
		return phrase ; 
	}
}
