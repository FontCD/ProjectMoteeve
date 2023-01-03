package CompleteAchievement;

import Factory.BaseObject;
import Factory.ObjectFactory;
import Factory.Sticker;

public class completeAchievementController {

	public CompleteAchievementStickerBean unlockAchievement(completeAchievementIdBean bean) throws Exception {
																							//istanzio il nuovo dao 
		int index = bean.getBean() ; 								//prendo l'index dal bean 
		
		ObjectFactory factory = new ObjectFactory() ;  																	//chiamo la funzione del dao che mi ritorna un ach 
		BaseObject ach = factory.createBaseObject("Ach") ; 
		ach.setComplete(index) ;
		ach = ach.extractObject(index) ; 
		
		Sticker stk = new Sticker(); 										//chiamo l'altro metodo get reward che ritorna una sticker
		int stkIndex = ach.getReward() ; 
		stk.setOwned(stkIndex);
		stk = stk.extractSticker(stkIndex) ; 
		
		CompleteAchievementStickerBean retBean = new CompleteAchievementStickerBean(); 
		
		retBean.setBean(stk.getName(), stk.getStickerUrl()) ; 											//carico i risultati nel bean 
		
		return retBean ; 
	}
}
