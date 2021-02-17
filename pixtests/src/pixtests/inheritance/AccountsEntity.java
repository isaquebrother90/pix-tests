package pixtests.inheritance;

public abstract class AccountsEntity {

	public int numeroConta;
	public String titular;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta=numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular=titular;
	}
	
}
