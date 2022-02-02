
package aplicacao;
public class Cliente {
	public final int numeroConta;
	public String nomeCliente;
	public double 	saldo = 00.00;
	
	public Cliente(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nome;
	}
	
	public Cliente(int numeroConta, String nome, Double depositoInicial ) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nome;
		this.depositar(depositoInicial);
		
		
	}

	
	public int getNumeroConta() {
		return numeroConta;
	}		
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	//metodos
	
	
	public String toString(){
		return "\nNUMBER ACCOUNT: "+ this.getNumeroConta()  +
						   "\nACCOUNT HOLDER: "+ this.getNomeCliente()  +
						   "\nBALANCE: $"+String.format("%.2f" , this.getSaldo());
	
	}
	
	protected void depositar(double valor){
		this.setSaldo(valor += this.getSaldo());
	}
	
	protected void sacar(double valor){
		double taxa = 05.00;
		double saldo = this.getSaldo();
		double novosaldo = (saldo -= valor);
		this.setSaldo(novosaldo -= taxa);
	}
	
	
		
		
}
