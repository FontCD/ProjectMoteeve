package Logic;

public class askToMoteeveUserBoundary {
	
	public void askToMoteeve() {
		
		askToMoteeveController controller = new askToMoteeveController() ; 			//istanzio controller
		
		controller.randomMotivationalPhrase() ; 									//il bean riceve il parametro da stampare
		
		System.out.println(AskToMoteeveMotPhrBean.getBean()) ; 						//stampo il risultato 
	}
}
