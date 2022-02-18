
package aplicacao.entity;


public abstract class Cliente {
	private String nomeCliente;
	private int cpf;
	private Double rendaAnual;

	public Cliente(String nomeCliente, int cpf, Double rendaAnual) {
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.rendaAnual = rendaAnual;
	}
		
	public double getRendaAnual() {
		return rendaAnual;
	}


	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}


	protected String getNomeCliente() {
		return nomeCliente;
	}
	
	protected void setNomeCliente(String nome) {
		this.nomeCliente = nome;
	}
	
	protected int getCpf() {
		return cpf;
	}

	protected void setCpf(int cpf) {
		this.cpf = cpf;
	}	
	
	
	protected abstract Double pagamentoTaxas();
	
	public abstract String toString();
}
