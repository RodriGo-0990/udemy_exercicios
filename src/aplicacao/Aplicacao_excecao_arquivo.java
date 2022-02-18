package aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aplicacao_excecao_arquivo {

	public static void main(String[] args) {
		File file = new File("/home/rodrigo/vpn");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		
		}catch(FileNotFoundException e){
			
			System.out.println("erro ao abrir arquivo: " +e.getMessage());

		}finally {
				
			if(sc != null) {
			sc.close();
			}
			
			System.out.println("finally!!");
		}	
		
	}

	
}


