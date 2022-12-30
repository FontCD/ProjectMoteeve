package CompleteAchievement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Logic.Connectivity;

public class StickerDAOJDBC {
	
	public Sticker rewardSticker(String index) throws SQLException {
	    	
		Connection conn = Connectivity.getConn(); 																															//dalla classe connectivity prendo la connessione
    	PreparedStatement stmt = null; 
    	
    	String StickerUrl ;																																					//parametro che ci servirà conservare lo sticker
    	String name; 																																						
                
        try {
			stmt = conn.prepareStatement("UPDATE Sticker SET Status = 1 WHERE idSticker =" + index, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ; 		//creo lo statement di update, il set a 1 identifica sbloccato
			stmt.executeUpdate() ; 	
			Connectivity.close(stmt) ; 																																		// chiudo lo statement
			

			stmt = conn.prepareStatement("SELECT StickerUrl,Name FROM Sticker WHERE idSticker =" + index, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ;	//creo uno statement che porta un result set
			ResultSet rs = stmt.executeQuery() ; 																															//eseguo la query
			
			rs.first();																																						
			StickerUrl = rs.getString("StickerUrl") ;  																														//punto la tupla ritornata dalla query
	        name = rs.getString("name") ;																																	//prendo la colonna name
			rs.close(); 																																					//chiudo il result set
	        
	        
        } finally {
        	Connectivity.close(stmt) ; 																																		//dalla classe connectivity chiudo lo statement
        }		
        
        Sticker stk = new Sticker(StickerUrl, name) ; 																														//creo una nuoa istanza della classe sticker che porta l'url dello sticker e il suo nome
        
        return stk ; 																									  									
	        	 
		}
}
	
