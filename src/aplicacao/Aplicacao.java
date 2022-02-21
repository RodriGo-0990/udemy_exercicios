package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import aplicacao.entity.Account;
import aplicacao.entity.Bank;
import aplicacao.entity.Cliente;
import aplicacao.entity.ClienteCompany;
import aplicacao.entity.ClienteIndividual;
import aplicacao.entity.IndividualAccount;
import aplicacao.entity.businessAccount;
import aplicacao.util.Util;

public class Aplicacao   {

	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
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
					
					if(util.definirOpcao(opcao)){	//cria cliente individual com conta individual 
						
						System.out.println("ENTER WITH INCOME VALUE: ");	
						sc.nextLine();
						Double rendaAnual = sc.nextDouble(); 
						
						System.out.println("ENTER WITH HEALTH EXPENDITURE VALUE: ");	
						sc.nextLine();
						Double gastos_com_saude = sc.nextDouble();
						
						System.out.println("CREATING INDIVIDUAL ACCOUNT... ");
						System.out.println("ENTER WHIT ACCOUNT NUMBER: ");
						int numberAccount = sc.nextInt();
						
						
						Cliente cliente = new ClienteIndividual(nomeCliente, cpf, rendaAnual, gastos_com_saude);
						IndividualAccount account = new IndividualAccount(numberAccount, (ClienteIndividual) cliente);
						
						//operações
						
						System.out.println("ENTER WHIT NEW DEPOSIT: "); // deposito
						Double amount = sc.nextDouble();
						account.depositar(amount);
						System.out.println(account.ExibirSaldo());
						
						System.out.println("ENTER WHIT WHITDROW AMOUNT: "); // saque
						amount = sc.nextDouble();
						account.sacar(amount);
						System.out.println(account.ExibirSaldo());
						
						//adiciona conta na lista do banco(Bank)
						bank.Lista_de_contas.add(account);
						
						}
						
					else{ // OU cliente company com conta business
						
						System.out.println("ENTER WITH INCOME VALUE: ");	
						sc.nextLine();
						Double rendaAnual = sc.nextDouble(); 
						
						System.out.println("ENTER WITH EMPLOYERS NUMBER: ");	
						sc.nextLine();
						int employes = sc.nextInt();
						
						System.out.println("CREATING BUSINESS ACCOUNT... ");
						System.out.println("ENTER WHIT NUMBER ACCOUNT: ");
						int numberAccount = sc.nextInt();
						
					Cliente cliente = new ClienteCompany(nomeCliente, cpf, rendaAnual, employes);
					businessAccount account = new businessAccount(numberAccount, (ClienteCompany) cliente);
					
					//operações
					
					System.out.println("ENTER WHIT NEW DEPOSIT: "); // deposito
					Double amount = sc.nextDouble();
					account.depositar(amount);
					System.out.println(account.ExibirSaldo());
					
					System.out.println("ENTER WHIT WHITDROW AMOUNT: "); // saque
					amount = sc.nextDouble();
					account.sacar(amount);
					System.out.println(account.ExibirSaldo());
					
					
					//adiciona conta na lista do banco(Bank)
					bank.Lista_de_contas.add(account);
					
				}
			
		}sc.close();
		
		System.out.println("\n----FIM----");
		
		//exibir dados de todas os clientes.
		
		for (Account obj : bank.Lista_de_contas) {
			System.out.println(obj);
		}
	}
}		
	
	
