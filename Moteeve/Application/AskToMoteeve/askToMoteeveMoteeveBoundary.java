package AskToMoteeve;

import Logic.MoteeveFunctions;

public class askToMoteeveMoteeveBoundary {
	
	public askToMoteeveIndexBean giveIndex() {
		
		int index ; 
		index = MoteeveFunctions.generateNumber() ; 					//dato che Moteeve è una API chiedo di generarmi un indice
		
		askToMoteeveIndexBean bean = new askToMoteeveIndexBean() ; 
		
		bean.setBean(index);							//setto il bean per il passaggio di parametri
		
		return bean; 
	}
}
