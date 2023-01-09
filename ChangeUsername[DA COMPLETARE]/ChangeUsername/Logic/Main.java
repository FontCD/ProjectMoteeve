import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws Exception {

        //BOUNDARY CALL
        ChangeUsernameUserBoundary userBoundaryIstance = new ChangeUsernameUserBoundary();
        userBoundaryIstance.changeUsername();

        //CONNECTION
        Connection conn = Connectivity.getConn();
        Connectivity.disconnect(conn);

    }

}