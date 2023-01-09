import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connectivity {

    //CONNECTION VARIABLES
    private static final String USERNAME = "MoteeveUser";
    private static final String PASSWORD = "Moteeve";
    private static final String DBURL = "jdbc:mysql://localhost:3306/progettoispw";
    public static Connection conn;

    private Connectivity() {
        throw new IllegalStateException("Utility class");
    }

    //CONNECTION METHOD
    public static Connection getConn() throws SQLException {
        conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        return conn;
    }

    //CLOSE A STATEMENT METHOD
    public static void close(PreparedStatement stmt) {
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException se2) {
            se2.printStackTrace();
        }
    }

    //DISCONNECTION METHOD
    public static void disconnect(Connection conn) {
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

}
