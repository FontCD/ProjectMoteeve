package Factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Logic.Connectivity;

public class TaskDAOJDBC {
	private BaseObject task ; 
	private Connection conn = Connectivity.getConn(); 																																	//dalla classe connectivity prendo la connessione
	private PreparedStatement stmt = null; 

	public BaseObject extractTask(int index) throws Exception  {
    	    	 																																						          
        try {				
        	String forQuery = String.valueOf(index) ; 
        	stmt = conn.prepareStatement("SELECT * FROM Task WHERE idTask =" + forQuery, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ;			//creo uno statement che porta un result set 
			ResultSet rs = stmt.executeQuery() ; 																																	//eseguo la query
			
			rs.first();																																								//punto la tupla ritornata dalla query
			String name = rs.getString("Name") ; 
			String script = rs.getString("Script") ; 
			String color = rs.getString("color") ; 
			boolean status = rs.getBoolean("status") ; 
			int reward = rs.getInt("reward"); 																																		//prendo la colonna sticker

			rs.close(); 																																							// chiudo il result se
			ObjectFactory factory = new ObjectFactory() ; 																															//creo una nuoa istanza della classe achievement che porta l'id dello sticker ricompensa
	        task = factory.createBaseObject("Task") ; 
	        task.setObject(name,script,color,status,reward) ; 
			
        } finally {
        	Connectivity.close(stmt) ; 																																				//dalla classe connectivity chiudo lo statement
        }		
        
		return task ; 		
	}
	
	public void setComplete(int index) throws Exception {
		String forQuery = String.valueOf(index); 
		stmt = conn.prepareStatement("UPDATE Task SET Status = 1 WHERE idTask =" + forQuery, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ; 		//creo lo statement di update, il set a 1 identifica completato
		stmt.executeUpdate() ;	
		Connectivity.close(stmt) ; 
	}
}
