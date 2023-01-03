package CompleteAchievement;

public class completeAchievementUserBoundary {

	public void completeAchievement(int index) throws Exception {
		
		completeAchievementIdBean bean = new completeAchievementIdBean() ; 
		bean.setBean(index);																			//metto nel bean l'indice dell'ach che andrà completato
		
		completeAchievementController controller = new completeAchievementController() ; 				//istanzio il controller applicativo 
		CompleteAchievementStickerBean printBean = controller.unlockAchievement(bean) ; 																	//chiamo la funzione del controller
		
		System.out.println("Congrats bro"); 
		System.out.println(printBean.getNameBean()) ; 								//prendo dal bean il risultato, nome e url
		System.out.println(printBean.getStickerUrlBean()) ; 
		
	} 
	
}
