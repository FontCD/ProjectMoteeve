import java.sql.*;

public class UsernameDAO {

    private Connection conn = Connectivity.getConn();
    private PreparedStatement stmt = null;
    private Username ret;

    public UsernameDAO() throws SQLException {}

    public Username retrieveUsername() throws SQLException {

        String username;

        try {

            stmt = conn.prepareStatement("SELECT * FROM username", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY ) ;
            ResultSet rs = stmt.executeQuery();
            rs.first();
            username = rs.getString("username");
            rs.close();

        } finally {
            Connectivity.close(stmt);
        }

        ret = new Username();
        ret.setUsername(username);

        return ret;

    }

}
