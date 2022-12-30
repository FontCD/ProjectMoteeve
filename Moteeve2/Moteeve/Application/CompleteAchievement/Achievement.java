package CompleteAchievement;

public class Achievement {																			//Entity 

	private String script;
	private int idSticker ; 
	private String color ; 
	private boolean status; 
	
	

	public Achievement (String script, int idSticker, boolean status, String color) { 				//costruttore completo
		this.script = script ; 
		this.idSticker = idSticker; 
		this.color = color ; 
		this.status = status ; 
	}
	
	public Achievement (int idSticker) {															//costruttore solo con idSticker
		this.idSticker = idSticker ;
	}
	
	public String getScript() {																		//getter
		return script ; 
	}
	
	public int getidSticker() {																		//getter
		return idSticker ; 
	}
	
	public String color() {																			//getter
		return color ; 
	}
	
	public boolean getStatus() {																	//getter
		return  status; 	
	}
	
}
