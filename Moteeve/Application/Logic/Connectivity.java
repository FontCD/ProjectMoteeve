package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connectivity {																	//classe che gestisce la connettività dell'applicazione al database
																							//parametri di connessione
	private static String USER = "MoteeveUser";
    private static String PASS = "Moteeve";
    private static String DB_URL = "jdbc:mysql://localhost:3306/progettoispw";
    
    public static Connection conn = null ; 
    
    
    
    public static Connection getConn() {													//metodo che serve ai DAO per prendere la connessione
		return conn;
    }
    
    public static Connection connect() throws SQLException {								//metodo da utilizzare al lancio del programma che crea una connessione con il db e cambia l'attributo conn
    
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
        return conn;
    }
    
    public static void close(PreparedStatement stmt) {										//metodo che chiude lo statement
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException se2) {
            se2.printStackTrace();
        }
    }
    	
    	
    
    public static void disconnect(Connection conn) {										//metodo da usare alla chiusura dell'applicazione e che chiude la connessione con il databse
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
