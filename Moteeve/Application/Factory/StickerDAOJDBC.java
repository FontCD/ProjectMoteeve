package Factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Logic.Connectivity;

public class StickerDAOJDBC {
	
	private Connection conn = Connectivity.getConn(); 																															//dalla classe connectivity prendo la connessione
	private PreparedStatement stmt = null; 
	private Sticker stk = new Sticker() ; 
	
	public Sticker extractSticker(int index) throws SQLException {																																					
                
        try {																																// chiudo lo statemen
    		String forQuery = String.valueOf(index) ; 
        	stmt = conn.prepareStatement("SELECT * FROM Sticker WHERE idSticker =" + forQuery, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ;	//creo uno statement che porta un result set
			ResultSet rs = stmt.executeQuery() ; 																															//eseguo la query
			
			rs.first();																																						  																														//punto la tupla ritornata dalla query
	        String name = rs.getString("Name") ;																																	//prendo la colonna name
	        String StickerUrl = rs.getString("StickerUrl") ;
	        boolean status = rs.getBoolean("Status") ; 
	        rs.close(); 																																					//chiudo il result set
	        
	        stk = new Sticker() ; 
	        stk.setSticker(name, StickerUrl, status);
	        
        } finally {
        	Connectivity.close(stmt) ; 																																		//dalla classe connectivity chiudo lo statement
        }																												//creo una nuoa istanza della classe sticker che porta l'url dello sticker e il suo nome
        
        return stk ; 																									  									
	        	 
		}
	
	public void setOwned(int index) throws SQLException {
		String forQuery = String.valueOf(index) ; 
		stmt = conn.prepareStatement("UPDATE Sticker SET Status = 1 WHERE idSticker =" + forQuery, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ; 		//creo lo statement di update, il set a 1 identifica sbloccato
		stmt.executeUpdate() ; 	
		Connectivity.close(stmt) ; 	
	}
}
	
