package pixtests.entities;

import pixtests.inheritance.AccountsEntity;
import pixtests.interfaces.Transactions;
import pixtests.services.TransactionHistory;

public class SavingsAccount extends AccountsEntity implements Transactions {

	private Double accountBalance = 2356.60;
	private int pixKey = 0;

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public void transfer(Double valueToTransfer) {

		Double receiveValue = valueToTransfer;

		if (valueToTransfer < this.accountBalance || valueToTransfer == null) {
			this.accountBalance = accountBalance - receiveValue;
			TransactionHistory.transactionNumberGenerator();
		} else {
			System.out.println("N�o � poss�vel fazer a opera��o. Saldo insuficiente!");
		}

		return;
	}

	@Override
	public void deposit(Double valueToDeposit) {

		Double receiveValue = valueToDeposit;

		if (valueToDeposit < this.accountBalance || valueToDeposit == null) {
			this.accountBalance = accountBalance - receiveValue;
			TransactionHistory.transactionNumberGenerator();
		} else {
			System.out.println("N�o � poss�vel fazer a opera��o. Saldo insuficiente!");
		}

		return;

	}

	@Override
	public void pixTransfer(Double valueToPix) {

		Double receiveValue = valueToPix;
		int receiveKey = this.pixKey;

		if (!(receiveKey == 0) && (valueToPix < this.accountBalance && !(valueToPix == 0.0))) {
			this.accountBalance = accountBalance - receiveValue;
			TransactionHistory.transactionNumberGenerator();
		} else if (receiveKey == 0) {
			System.out.println("N�o � poss�vel fazer a opera��o. Chave Pix n�o cadastrada!");
		} else {
			System.out.println("N�o � poss�vel efetuar a opera��o. Saldo insuficiente!");
		}

		return;
	}

	@Override
	public String toString() {
		return "" + accountBalance + "";
	}

}
