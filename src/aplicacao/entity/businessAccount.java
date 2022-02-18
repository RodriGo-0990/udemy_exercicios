package aplicacao.entity;

import javax.security.auth.login.AccountException;

import aplicacao.util.operationsAccount;

public final class businessAccount extends Account{
		private static operationsAccount operacoes;
		private final Double MAX_SAQUE_ = 500.00;
		private Double saldo;
		public businessAccount(int NUMERO_DA_CONTA, ClienteCompany cliente, Double saldo){
			super(cliente, operacoes, saldo);
		}
		
		private void validarSaque(Double amount) throws AccountException {
			if(amount > MAX_SAQUE_) {
				throw new AccountException("LIMITE DE SAQUE EXCEDIDO!!");
			}if(amount > saldo) {
				throw new AccountException("SALDO INSUFICIENTE!!");
			}
		}
		
		

		@Override
		protected void depositar(Double valor) {
			businessAccount.operacoes = operationsAccount.DEPOSITO;
			this.saldo += valor;
		}
		
		@Override
		protected void sacar(Double valor){
			try {
				validarSaque(valor);
				businessAccount.operacoes = operationsAccount.SAQUE;
				this.saldo -= valor;
				
			} catch (AccountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		@Override
		protected void cancelar(Cliente cliente) {
			businessAccount.operacoes = operationsAccount.CANCELAMENTO;
		}


		
}
