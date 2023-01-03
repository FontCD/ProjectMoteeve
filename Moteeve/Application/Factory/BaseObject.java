package Factory;

public interface BaseObject {
	
	void setObject(String name, String script, String color, boolean status, int reward); 
	
	public String getName() ; 
	
	public String getScript() ; 
	
	public String getColor() ; 
	
	public boolean getStatus() ; 
	
	public int getReward() ;
	
	public void setComplete(int index) ;
	
	public BaseObject extractObject(int index) throws Exception ; 
	
}
