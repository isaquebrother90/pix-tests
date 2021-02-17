package pixtests.entities;

import pixtests.inheritance.AccountsEntity;
import pixtests.interfaces.Transactions;
import pixtests.services.HistoricoTransacao;

public class CurrentAccount extends AccountsEntity implements Transactions {

	private Double saldo = 900.30;
	private int chavePix = 0;

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void transferir(Double valueToTransfer) {
		
		Double recebeValor = valueToTransfer;
		
		if (valueToTransfer < this.saldo || valueToTransfer == null) {
			this.saldo = saldo - recebeValor;
			HistoricoTransacao.gerarNumeroTransacao();
	    }else {
				System.out.println("Não é possível fazer a operação. Saldo insuficiente!");
			}
		
		return;
	}

	@Override
	public void depositar(Double valueToDeposit) {
		
		Double recebeValor = valueToDeposit;
		
		if (valueToDeposit < this.saldo || valueToDeposit == null) {
			this.saldo = saldo - recebeValor;
			HistoricoTransacao.gerarNumeroTransacao();
	    }else {
				System.out.println("Não é possível fazer a operação. Saldo insuficiente!");
			}
		
		return;
		
	}

	@Override
	public void pix(Double valueToPix) {
		
		Double recebeValor = valueToPix;
		int chave = this.chavePix;
		
		if (!(chave == 0) && (valueToPix < this.saldo && !(valueToPix == 0.0))) {
			this.saldo = saldo - recebeValor;
			HistoricoTransacao.gerarNumeroTransacao();
	    }else if(chave == 0){
			System.out.println("Não é possível fazer a operação. Chave Pix não cadastrada!");
		}else {
			System.out.println("Não é possível efetuar a operação. Saldo insuficiente!");
		}
		
		return;
	}
	
	@Override
	public String toString() {
		return "" + saldo + "";
	}
	
	
}
