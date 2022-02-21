package aplicacao.entity;

import aplicacao.Exceptions.AccountExceptions;

public final class businessAccount extends Account{
		private Double saldo;
		private final Double MAX_SAQUE_ = 500.00;
		public businessAccount(int NUMERO_DA_CONTA, ClienteCompany cliente){
			super(cliente, NUMERO_DA_CONTA);
			this.saldo = 0.0;
			
		}
		
		public Double getSaldo() {
			return saldo;
		}

		private void validarSaque(Double amount) throws AccountExceptions {
			if(amount > MAX_SAQUE_) {
				throw new AccountExceptions("LIMITE DE SAQUE EXCEDIDO!!");
			}if(amount > this.saldo) {
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
			try {
				validarSaque(valor);
				this.saldo -= valor;
				
			} catch (AccountExceptions e) {
				e.getMessage();
			}
			
		}

		@Override
		public String toString() {
			return "businessAccount: - " + getNUMERO_DA_CONTA() + "\n"+
					this.getCliente().toString()+
					this.ExibirSaldo()+"\n"+"------------";
		}

		
		
}
