package CompleteAchievement;

public class Sticker {																//Entity
	
	private String StickerUrl; 
	private String Name ; 
	private boolean Status ; 
	
	public Sticker (String StickerUrl, String name, boolean Status) { 		
		this.StickerUrl = StickerUrl ; 
		this.Name = name; 
		this.Status = Status ; 
	}
	
	public Sticker (String StickerUrl, String name) { 		
		this.StickerUrl = StickerUrl ; 
		this.Name = name;
	}
	
	public String getName() {
		return  Name; 
	}
		
	public String getStickerUrl() {
		return  StickerUrl; 	
	
	}
	
	public boolean getStatus() {
		return  Status; 	
	}
	
}

