package aplicacao;

public class Util {
	
	protected boolean definirOpcao(char Y){
		char  y = Y;
		boolean opcao = true;
		
		if (y != 'y' ){
		 	opcao = false;
		}
	return opcao;	 
	}
	
}
