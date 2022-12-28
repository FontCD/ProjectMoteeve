package Logic;

public class askToMoteeveUserBoundary {
	
	public void askToMoteeve() {
		
		askToMoteeveController controller = new askToMoteeveController() ; //istanzio controller
		AskToMoteeveMotPhrBean bean = new AskToMoteeveMotPhrBean() ; //istanzio il bean che riceverà il parametro
		
		bean = controller.randomMotivationalPhrase() ; //il bean riceve il parametro da stampare
		
		System.out.println(bean.getBean()) ; 
	}
}
