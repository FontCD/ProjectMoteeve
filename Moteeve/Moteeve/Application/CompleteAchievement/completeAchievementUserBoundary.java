package CompleteAchievement;

import java.sql.SQLException;

public class completeAchievementUserBoundary {

	public void completeAchievement(int index) throws SQLException {
		
		completeAchievementIdBean.setBean(index);														//metto nel bean l'indice dell'ach che andrà completato
		
		completeAchievementController controller = new completeAchievementController() ; 				//istanzio il controller applicativo 
		controller.setAchievement() ; 																	//chiamo la funzione del controller
		
		System.out.println("Congrats bro"); 
		System.out.println(CompleteAchievementStickerBean.getNameBean()) ; 								//prendo dal bean il risultato, nome e url
		System.out.println(CompleteAchievementStickerBean.getStickerUrlBean()) ; 
		
	} 
	
}
