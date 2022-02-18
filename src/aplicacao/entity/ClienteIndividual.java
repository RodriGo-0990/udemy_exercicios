package aplicacao.entity;

public class ClienteIndividual extends Cliente {
	
	private Double gastosComSaude;
	

	public ClienteIndividual(String nomeCliente, int cpf, Double rendaAnual, Double gastos_com_saude ) {
		super(nomeCliente, cpf, rendaAnual);
		this.gastosComSaude = gastos_com_saude;
	}

	
	public double getGastosComSaude() {
		return gastosComSaude;
	}
	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}


	@Override
	protected Double pagamentoTaxas() {
		Double Tax = 0.0;
		if(getRendaAnual() < 20000) {
			Tax = (getRendaAnual() / 100) * 15;
			Tax -= getGastosComSaude()/2 ;
		}else {
			Tax = (getRendaAnual() / 100) * 25;
			Tax -= (getGastosComSaude()/2) ;
			
		}
		return Tax;
	}
	
	@Override
	public String toString() {
		return "NAME: " + getNomeCliente() + "\n" +
			"ANUAL OUTCOME: " + "$" + getRendaAnual() + "\n" +
			"HEALTH EXPENTURE: " + "$" + getGastosComSaude() +"\n" +
			"TAX PAYMENT: " + "$" + pagamentoTaxas() + "\n";
	}
	
	
	
	

}
