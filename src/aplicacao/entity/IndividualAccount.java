package aplicacao.entity;

import aplicacao.Exceptions.AccountExceptions;


public class IndividualAccount extends Account {
	private Double saldo;
	private final Double MAX_SAQUE_ = 200.00;
	public IndividualAccount(int NUMERO_DA_CONTA, ClienteIndividual cliente){
		super(cliente, NUMERO_DA_CONTA);
		this.saldo =0.0;
	}
	
	
	
	public Double getSaldo() {
		return this.saldo;
	}


	private void validarSaque(Double amount){
		if(amount > MAX_SAQUE_) {
			throw new AccountExceptions("LIMITE DE SAQUE EXCEDIDO!!");
		}if(amount > this.getSaldo()) {
			throw new AccountExceptions("SALDO INSUFICIENTE!!");
		}
	}
	
	public String ExibirSaldo() {
		return ("balance: $"+ this.saldo);
	}
	
	@Override
	public void depositar(Double valor) {
		
		this.saldo += valor;
	}
	
	@Override
	public void sacar(Double valor){
			validarSaque(valor);
			this.saldo -= valor;
		
	}

	@Override
	public String toString() {
		return "IndividualAccount: - "+ getNUMERO_DA_CONTA() + "\n"+
				this.getCliente().toString()+
				this.ExibirSaldo()+"\n"+"---------";
	}
	
	
	
	
}
