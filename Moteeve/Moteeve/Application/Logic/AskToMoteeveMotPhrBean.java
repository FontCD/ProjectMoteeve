package Logic;

public class AskToMoteeveMotPhrBean {						//bean per il passaggio frase da stampare 
	
	private static String phrase ; 					
	
	public static void setBean(String newphrase) {			//setter
		phrase = newphrase ; 
	}
	
	public static String getBean() {						//getter
		return phrase ; 
	}
}
