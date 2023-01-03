package Factory;

public class Task implements BaseObject {
	
	private String name; 
	private String script;
	private String color ; 
	private boolean status; 
	private int reward ; 

	public Task() {}
	
	@Override
	public void setObject (String name, String script, String color,boolean status, int reward) { 	//costruttore completo
		this.name = name ; 
		this.script = script ; 
		this.color = color ;
		this.status = status ;
		this.reward = reward ; 
 
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getScript() {
		return script;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public boolean getStatus() {
		return status;
	}
	
	@Override
	public int getReward() {
		return reward ; 
	}

	@Override
	public void setComplete(int index) {
		TaskDAOJDBC dao = new TaskDAOJDBC() ;
		try {
			dao.setComplete(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public BaseObject extractObject(int index) throws Exception {
		TaskDAOJDBC dao = new TaskDAOJDBC() ;
		ObjectFactory factory = new ObjectFactory() ; 
		
		BaseObject tsk = factory.createBaseObject("Task") ; 
		tsk = dao.extractTask(index) ;

		return tsk ; 
		
	}
}
