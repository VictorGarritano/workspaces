package bankAccounts;


public class Conta {
	protected double saldo;  //The current saldo
	private int numeroConta;  //The account number


	public Conta () { // Constructor
		saldo = 0.0;
	}
	
	public Conta (int numeroConta) {   // Constructor 
		saldo=0.0;
		this.numeroConta = numeroConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getNumeroConta() {
		return numeroConta;
	}
	
	public void deposito (double sum) {
		if (sum>0) {
			saldo +=sum;
		}
		else {
			System.out.println("Deposito: "
					+" Não é possível depositar valor negativo.");
		}
	}

	public void retirada (double sum) {
		if (sum>0) {
			saldo-=sum;
		}
		else {
			System.out.println("Retirada: "
					+"Não é possível retirar valor negativo.");
		}
	}

	public String toString() {
		return "Acc " + numeroConta + ": " + "saldo = " + saldo;    
	}

	public final void print() {
		//Don't override this,
		//override the toString method
		System.out.println( toString() );    
	}

}