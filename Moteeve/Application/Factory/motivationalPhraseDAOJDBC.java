package Factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Logic.Connectivity;

public class motivationalPhraseDAOJDBC {
	
	private Connection conn = Connectivity.getConn(); 													//dalla classe connectivity prendo la connessione
	private PreparedStatement stmt = null; 
    private motivationalPhrase motPh ; 
	
    public motivationalPhrase randomMotivationalPhrase (int index) throws SQLException { 	
    	
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
        
        motPh = new motivationalPhrase() ;																		//istanzio una motivationaLphrase							  									//cambio lo stato di motivationalphrase con quella nuova presa
        motPh.setMotivationalPhrase(phrase) ; 
		
        return motPh ; 
   }
}
    
    


   
