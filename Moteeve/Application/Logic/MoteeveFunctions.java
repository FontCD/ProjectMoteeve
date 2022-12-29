package Logic;

public class MoteeveFunctions {
	
	public static int generateNumber() {
		
		int index ; 
		
    	int maxTuple = 3 ; 														//questo è il numero di tuple nella tabella motivationalphrase
    	index = (int)Math.floor(Math.random()*(maxTuple) + 1) ; 				//genero un numero randomico da usare come indice per la query
    	
    	return index; 
    	
	}
}
