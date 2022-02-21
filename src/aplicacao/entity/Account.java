package aplicacao.entity;

import aplicacao.util.operationsAccount;

public abstract class Account  {
	
	private int NUMERO_DA_CONTA;
	private Cliente cliente;
	private operationsAccount operacoes;
	private Double saldo;
	
	public Account(Cliente cliente, int numero_da_conta) {
		this.cliente = cliente;
		this.NUMERO_DA_CONTA = numero_da_conta;
	}
	
	public Account(Cliente cliente, operationsAccount operacoes, Double saldo) {
		this.cliente = cliente;
		this.operacoes = operacoes;
		this.saldo = saldo;
	}


	public int getNUMERO_DA_CONTA() {
		return NUMERO_DA_CONTA;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public operationsAccount getOperacoes() {
		return operacoes;
	}
	public void setOperacoes(operationsAccount operacoes) {
		this.operacoes = operacoes;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	//metodos de serviços de conta;
	
	protected abstract void sacar(Double valor);
	
	protected abstract void depositar(Double valor);

}

