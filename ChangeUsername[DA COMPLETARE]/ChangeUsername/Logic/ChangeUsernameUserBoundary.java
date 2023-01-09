import java.sql.SQLException;

public class ChangeUsernameUserBoundary {

    public void changeUsername() throws SQLException {

        ChangeUsernameController controller = new ChangeUsernameController();
        ChangeUsernameBean bean = controller.setNewUsername();

        System.out.println(bean.getContent());

    }

}
