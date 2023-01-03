package Factory;

public class ObjectFactory {
	
	public BaseObject createBaseObject(String type) throws Exception {
		
		switch (type) {
			case "Ach": 
				return new Achievement() ; 
			case "Task": 
				return new Task() ; 
			default: 
				throw new Exception("Type not found"); 
		}
	}	
}
