import java.sql.SQLException;
public class ChangeUsernameController {

    //BUFFER WHICH WILL CONTAIN THE USERNAME RETRIEVED FROM THE DATABASE
    String buffer;

    public ChangeUsernameBean setNewUsername() throws SQLException {

        ChangeUsernameBean bean = new ChangeUsernameBean();

        bean.setContent(chooseNewUsername());
        return bean;

    }

    public String chooseNewUsername() throws SQLException {

        UsernameDAO myDAO = new UsernameDAO();
        Username retrieval = myDAO.retrieveUsername();


        buffer = retrieval.getUsername();
        return buffer;
    }

}
