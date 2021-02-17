package pixtests;

import java.util.UUID;

import pixtests.entities.CurrentAccount;
import pixtests.entities.SavingsAccount;
import pixtests.interfaces.Transactions;
import pixtests.services.TransactionHistory;

public class MainProgram {

	public static void main(String[] args) {

		Transactions currentAccount = new CurrentAccount();
		Transactions savingsAccount = new SavingsAccount();

//		Testes de m�todos de conta corrente
		
//	    currentAccount.transfer(796.50);
//		currentAccount.deposita(796.50);
//		currentAccount.pixTransfer(3000.50);

//		Testes de m�todos de poupan�a

//		savingsAccount.transfer(796.50); 
//		savingsAccount.deposit(796.50);
//		savingsAccount.pixTransfer(796.50);

		System.out.println(savingsAccount.toString());
		System.out.println(currentAccount.toString());

//		Testes de gera��o de n�meros aleat�rios com ou sem UUID

		System.out.println(UUID.randomUUID().toString());
		System.out.println(TransactionHistory.transactionNumberGenerator());
//		System.out.println();
//		System.out.println(Long.toHexString(0x8000000000000000L | 21));
//		System.out.println(Long.toBinaryString(0x8000000000000000L | 21));
//		System.out.println(Long.toHexString(Long.MAX_VALUE + 1));
	}

}
