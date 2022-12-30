package Logic;

public class askToMoteeveMoteeveBoundary {
	
	public void giveIndex() {
		
		int index ; 
		index = MoteeveFunctions.generateNumber() ; 					//dato che Moteeve è una API chiedo di generarmi un indice
		
		askToMoteeveIndexBean.setBean(index);							//setto il bean per il passaggio di parametri
    	
	}
}
