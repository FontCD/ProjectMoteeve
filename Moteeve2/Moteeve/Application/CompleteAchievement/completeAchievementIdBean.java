package CompleteAchievement;

public class completeAchievementIdBean {					//bean con l'id dell'achievement da completare
		
	private static String index ; 					
	
	public static void setBean(int newindex) {				//setter
		
		index = String.valueOf(newindex) ; 
	}
	
	public static String getBean() {						//getter
		return index ; 
	}
}

