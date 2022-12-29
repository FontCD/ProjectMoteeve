package Logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class motivationalPhraseDAOJDBC {
    
    public motivationalPhrase generateMotivationalPhrase (String index) throws SQLException {
    	
    	Connection conn = Connectivity.getConn(); 													//dalla classe connectivity prendo la connessione
    	PreparedStatement stmt = null; 
    	
 	
    	String phrase ; 																			//parametro che ci servirà conservare la motivationalphrase
                
        try {
			stmt = conn.prepareStatement("SELECT * FROM motivationalphrase WHERE idPhrase = " + index, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ; //creo lo statement
			ResultSet rs = stmt.executeQuery() ; 																															//eseguo lo statement
			rs.first();																																						//punto la tupla ritornata dalla query
			
			phrase = rs.getString("phrase") ; 														//metto in phrase la striga contenuta nella colonna phrase
			
	        rs.close(); 																			// chiudo il result set
        } finally {
        	Connectivity.close(stmt) ; 																//dalla classe connectivity chiudo lo statement
        }		
        
        motivationalPhrase motPhrase = new motivationalPhrase() ;									//istanzio una motivationaLphrase
        motPhrase.setPhrase(phrase) ; 							  									//cambio lo stato di motivationalphrase con quella nuova presa
        
		return motPhrase ; 
   }
}
    
    


   
