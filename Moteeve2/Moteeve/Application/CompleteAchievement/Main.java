package CompleteAchievement;

import java.sql.Connection;
import java.sql.SQLException;

import Logic.Connectivity;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection conn = Connectivity.connect() ; 
		
		completeAchievementUserBoundary BD = new completeAchievementUserBoundary() ; 
		BD.completeAchievement(13);
		                                   
		Connectivity.disconnect(conn) ;

	}

}
