package Factory;

public class Sticker {																			//Entity
	
	private String Name ; 
	private String StickerUrl; 
	private boolean Status ; 
	
	public Sticker() {}
	
	public void setSticker (String name, String StickerUrl,  boolean Status) { 		
		this.Name = name; 
		this.StickerUrl = StickerUrl ;
		this.Status = Status ; 
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
	
	public void setOwned(int index) throws Exception {
		StickerDAOJDBC dao = new StickerDAOJDBC() ;
		dao.setOwned(index);
	}

	public Sticker extractSticker(int index) throws Exception {
		StickerDAOJDBC dao = new StickerDAOJDBC() ;
		
		Sticker stk = dao.extractSticker(index) ;

		return stk ; 
	}	
}

