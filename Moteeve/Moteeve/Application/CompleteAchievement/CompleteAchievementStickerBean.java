package CompleteAchievement;

public class CompleteAchievementStickerBean {									//bean per lo spostamento dello sticker verso il controller grafico 
	
	private static String Name ; 
	private static String StickerUrl ; 
	
	public static void setNameBean(String newName) {							//setter
		Name = newName ; 
	}
	
	public static void setStickerUrlBean(String newStickerUrl) {				//setter
		StickerUrl = newStickerUrl ; 
	}

	public static String getNameBean() {										//getter
		return Name ; 
	}
	
	public static String getStickerUrlBean() {									//getter
		return StickerUrl ; 
	}
}
