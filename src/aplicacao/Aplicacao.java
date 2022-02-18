package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import aplicacao.entity.Cliente;
import aplicacao.entity.ClienteCompany;
import aplicacao.entity.ClienteIndividual;
import aplicacao.util.Util;

public class Aplicacao   {

	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Cliente> listaClientes = new ArrayList<>();
		System.out.print("ENTER WHIT NUMBER OF CLIENTS: ");
		int N = sc.nextInt();
		
		for (int i = 1 ; i <= N ; i++) {
			System.out.print("ENTER WITH ACCOUNTER HOLDER: ");
			String nomeCliente = sc.next();
			
			System.out.print("ENTER WITH ACCOUNTER cpf/cnpj: ");
			int cpf = sc.nextInt();
			
			System.out.println("INDIVIDUAL OR COMPANY:  i or c ");
			
				sc.nextLine();
				Util util = new Util();
				char opcao = sc.next().charAt(0);
				util.definirOpcao(opcao);
					
					if(util.definirOpcao(opcao)){
						
						System.out.println("ENTER WITH INCOME VALUE: ");	
						sc.nextLine();
						Double valor = sc.nextDouble(); 
						
						System.out.println("ENTER WITH HEALTH EXPENDITURE VALUE: ");	
						sc.nextLine();
						Double valor_ = sc.nextDouble();
						
						Cliente cliente = new ClienteIndividual(nomeCliente, cpf, valor, valor_);
						listaClientes.add(cliente);
						}
						
					else{
						
						System.out.println("ENTER WITH INCOME VALUE: ");	
						sc.nextLine();
						Double valor = sc.nextDouble(); 
						
						System.out.println("ENTER WITH EMPLOYERS NUMBER: ");	
						sc.nextLine();
						int employes = sc.nextInt();
						
					Cliente cliente_ = new ClienteCompany(nomeCliente, cpf, valor, employes);
					listaClientes.add(cliente_);
				}
			
		}sc.close();
		
		System.out.println("\n---FIM----");
		
		//exibir dados de todas os clientes.
		
		for (Cliente obj : listaClientes) {
			System.out.println(obj);
		}
	}
	}		
	
	
