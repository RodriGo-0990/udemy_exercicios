package aplicacao.entity;

import aplicacao.util.operationsAccount;

public abstract class Account  {
	
	private static int NUMERO_DA_CONTA;
	private Cliente cliente;
	private operationsAccount operacoes;
	private Double saldo;
	
	public Account() {
	
	}
	
	public Account(Cliente cliente, operationsAccount operacoes, Double saldo) {
		super();
		this.cliente = cliente;
		this.operacoes = operacoes;
		this.saldo = saldo;
	}


	public static int getNUMERO_DA_CONTA() {
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
	
	protected abstract void cancelar(Cliente cliente);

}

