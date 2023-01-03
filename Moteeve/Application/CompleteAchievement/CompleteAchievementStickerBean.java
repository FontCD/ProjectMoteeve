package CompleteAchievement;

public class CompleteAchievementStickerBean {									//bean per lo spostamento dello sticker verso il controller grafico 
	
	private String Name ; 
	private String StickerUrl ; 
	
	public void setBean(String newName, String newStickerUrl) {							//setter
		Name = newName ;
		StickerUrl = newStickerUrl; 
	}

	public String getNameBean() {										//getter
		return Name ; 
	}
	
	public String getStickerUrlBean() {									//getter
		return StickerUrl ; 
	}
}
