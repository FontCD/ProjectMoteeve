package AskToMoteeve;

public class askToMoteeveUserBoundary {
	
	public void askToMoteeve() {
		
		askToMoteeveController controller = new askToMoteeveController() ; 			//istanzio controller
																						//il bean riceve il parametro da stampare
		
		AskToMoteeveMotPhrBean bean =  controller.randomMotivationalPhrase() ;
		
		System.out.println(bean.getBean()) ; 											//stampo il risultato 
	}
}
