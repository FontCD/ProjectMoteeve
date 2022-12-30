package Logic;

public class askToMoteeveIndexBean {						//bean per il passaggio dell'indice della frase motivazionale
	
	private static String index ; 					
	
	public static void setBean(int newindex) {				//setter
		
		index = String.valueOf(newindex) ; 
	}
	
	public static String getBean() {						//getter
		return index ; 
	}

}
