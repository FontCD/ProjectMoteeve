import java.sql.SQLException;

public class Username {

    private String username;

    public Username() {

    }

    public void setUsername(String newString) {
        this.username = newString;
    }

    public String getUsername() {
        return username;
    }

    public Username UsernameDAO() throws SQLException {

        UsernameDAO myDAO = new UsernameDAO();

        return myDAO.retrieveUsername();

    }

}
