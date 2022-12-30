package CompleteAchievement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Logic.Connectivity;

public class AchievementDAOJDBC {

	public Achievement setComplete(String index) throws SQLException  {
    	
		Connection conn = Connectivity.getConn(); 																																	//dalla classe connectivity prendo la connessione
    	PreparedStatement stmt = null; 
    	
 	
    	int idSticker ; 																																							//parametro che ci servirà conservare l'achievement
                
        try {
			stmt = conn.prepareStatement("UPDATE Achievement SET Status = 1 WHERE idAchievement =" + index, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ; 		//creo lo statement di update, il set a 1 identifica completato
			stmt.executeUpdate() ;	
			Connectivity.close(stmt) ;																																				// chiudo lo statement

			stmt = conn.prepareStatement("SELECT Sticker FROM Achievement WHERE idAchievement =" + index, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ;			//creo uno statement che porta un result set 
			ResultSet rs = stmt.executeQuery() ; 																																	//eseguo la query
			
			rs.first();																																								//punto la tupla ritornata dalla query
			idSticker = rs.getInt("Sticker"); 																																		//prendo la colonna sticker
	        rs.close(); 																																							// chiudo il result set
	        
	        
        } finally {
        	Connectivity.close(stmt) ; 																																				//dalla classe connectivity chiudo lo statement
        }		
        
        Achievement ach = new Achievement(idSticker) ; 																																//creo una nuoa istanza della classe achievement che porta l'id dello sticker ricompensa
        
        return ach ; 																																											  									
        
		 
	}
	
}
