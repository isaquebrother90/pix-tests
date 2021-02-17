package pixtests;

import java.util.UUID;

import pixtests.entities.CurrentAccount;
import pixtests.entities.SavingsAccount;
import pixtests.interfaces.Transactions;
import pixtests.services.HistoricoTransacao;

public class Principal {

	public static void main(String[] args) {

		Transactions currentAccount = new CurrentAccount();
		Transactions savingsAccount = new SavingsAccount();
		
//		Testes métodos de conta corrente
//	    currentAccount.transferir(796.50);
//		currentAccount.depositar(796.50);
//		currentAccount.pix(3000.50);
		
//		Testes métodos de poupança
		
//		savingsAccount.transferir(796.50); 
//		savingsAccount.depositar(796.50);
//		savingsAccount.pix(796.50);

		System.out.println(savingsAccount.toString());
		System.out.println(currentAccount.toString());

//		Testes geração de números aleatórios com ou sem UUID
		
		System.out.println(UUID.randomUUID().toString());
		System.out.println(HistoricoTransacao.gerarNumeroTransacao());
//		System.out.println();
//		System.out.println(Long.toHexString(0x8000000000000000L | 21));
//		System.out.println(Long.toBinaryString(0x8000000000000000L | 21));
//		System.out.println(Long.toHexString(Long.MAX_VALUE + 1));
	}

}
