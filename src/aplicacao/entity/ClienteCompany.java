package aplicacao.entity;

public class ClienteCompany extends Cliente {
	
	private int numeroDeEmpregados;

	public int getNumeroDeEmpregados() {
		return numeroDeEmpregados;
	}

	public void setNumeroDeEmpregados(int numeroDeEmpregados) {
		this.numeroDeEmpregados = numeroDeEmpregados;
	}

	public ClienteCompany(String nomeCliente, int cpf, double rendaAnual, int numero_de_empregados) {
		super(nomeCliente, cpf, rendaAnual);
		this.numeroDeEmpregados = numero_de_empregados;
		
	}
	@Override
	protected Double pagamentoTaxas() {
		Double Tax = (getNumeroDeEmpregados() <= 10) ? 
				Tax = getRendaAnual() / 100 * 16 : 
						getRendaAnual() / 100 * 14;
		return Tax;
	}
	@Override
	public String toString() {
		return "NAME: " + getNomeCliente() + "\n" +
			"ANUAL OUTCOME: " + "$" + getRendaAnual() + "\n" +
			"EMPLOYERS NUMBER: " + getNumeroDeEmpregados() +"\n" +
			"TAX PAYMENT: " + "$" + pagamentoTaxas() + "\n";
	}

	
}
