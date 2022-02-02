package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente[] arrayContas = new Cliente[3];
		List<Cliente> listaClientes = new ArrayList<>();
		
		for (int i = 0; i < arrayContas.length; i++) {
			
		
		System.out.println("\nENTER WITH ACCOUNTER NUMBER: ");
		int numeroConta = sc.nextInt(); 
		System.out.println("ENTER WITH ACCOUNTER HOLDER: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();
		System.out.println("ENTER WITH INITIAL DEPOSIT?:  Y or N ");
		Util util = new Util();
		char opcao = sc.next().charAt(0);
		util.definirOpcao(opcao);
		
			if(util.definirOpcao(opcao)){
				System.out.println("ENTER WITH VALUE: ");	
				sc.nextLine();
				double valor = sc.nextDouble();
				Cliente cliente = new Cliente(numeroConta, nomeCliente, valor );
				System.out.println(cliente);
				listaClientes.add(cliente);
				
				System.out.println("\nDO A NEW OPERATION?:  Y or N ");
				sc.nextLine();
				char _opcao = sc.next().charAt(0);
				util.definirOpcao(_opcao);
				
				if(util.definirOpcao(_opcao)){
					System.out.println("ENTER WITH VALUE: ");	
					sc.nextLine();
					double valor_ = sc.nextDouble();
					cliente.sacar(valor_);
					System.out.println(cliente);
					}
				
			}else{
				Cliente cliente_ = new Cliente(numeroConta, nomeCliente);
				System.out.println(cliente_);
				listaClientes.add(cliente_);
				System.out.println("\nDO A NEW OPERATION?:  Y or N ");
				sc.nextLine();
				char opcao_ = sc.next().charAt(0);
				util.definirOpcao(opcao_);
						
					if(util.definirOpcao(opcao_)){
							 
						System.out.println("ENTER WITH VALUE: ");	
						sc.nextLine();
						double valor_ = sc.nextDouble();
						cliente_.sacar(valor_);	
						System.out.println(cliente_);
					};
					
						System.out.println(cliente_);
								
		
			}
			
		}
		
		
		
			sc.close();
			System.out.println("\n---FIM----");
		
		//exibir dados de todas as contas.
		
		for (Cliente obj : listaClientes) {
			System.out.println(obj);
		}
	}
	}		
	
	
