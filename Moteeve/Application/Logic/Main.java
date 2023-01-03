package Logic;

import java.sql.Connection;

import CompleteAchievement.completeAchievementUserBoundary;

public class Main {

	public static void main(String[] args) throws Exception {
		Connection conn = Connectivity.connect() ; 
		
		completeAchievementUserBoundary BD = new completeAchievementUserBoundary(); 
		BD.completeAchievement(13);
		                                   
		Connectivity.disconnect(conn) ;

	}

}
