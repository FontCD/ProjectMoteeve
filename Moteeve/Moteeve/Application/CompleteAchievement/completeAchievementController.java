package CompleteAchievement;

import java.sql.SQLException;

public class completeAchievementController {

	public void setAchievement() throws SQLException { 
		
		AchievementDAOJDBC dao = new AchievementDAOJDBC() ; 								//istanzio il nuovo dao 
		String index = completeAchievementIdBean.getBean() ; 								//prendo l'index dal bean 
		
		Achievement ach = dao.setComplete(index) ; 											//chiamo la funzione del dao che mi ritorna un ach 
		
		Sticker stk = getReward(ach.getidSticker()) ; 										//chiamo l'altro metodo get reward che ritorna una sticker
		CompleteAchievementStickerBean.setNameBean(stk.getName()) ; 						//carico i risultati nel bean 
		CompleteAchievementStickerBean.setStickerUrlBean(stk.getStickerUrl()) ;
		
	}
	
	private Sticker getReward(int idSticker) throws SQLException {
		StickerDAOJDBC dao = new StickerDAOJDBC() ; 										//creo una istanza del dao per gli sticker
		Sticker stk = dao.rewardSticker(String.valueOf(idSticker)) ;						//vhiamo il metodo del dao che ritorna uno sticker come ricompensa
		return stk; 
	}
	
}
