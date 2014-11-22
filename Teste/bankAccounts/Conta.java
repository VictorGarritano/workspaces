package bankAccounts;

public class Conta {
	protected double saldo; // Saldo corrente
	private int numeroConta;// Numero da conta

	public Conta() { // Construtor:
		saldo = 0.0;
	}

	public Conta(int numeroConta) { // Constructor
		saldo = 0.0;
		this.numeroConta = numeroConta;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getsaldo() {
		return saldo;
	}

	public void setnumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getNumeroConta() {
		return numeroConta;
	}

	public void deposito(double sum) {
		if (sum > 0) {
			saldo += sum;
		} else {
			System.err.println("Deposito: "
					+ " não é possível depositar valor negativo.");
		}
	}

	public void retirada(double sum) {
		if (sum > 0) {
			saldo -= sum;
		} else {
			System.err.println("Retirada: "
					+ "não é possível retirar valor negativo.");
		}
	}

	public String toString() {
		return "Acc " + numeroConta + ": " + "saldo = " + saldo;
	}

	public final void print() {
		// Don't override this,
		// override the toString method
		System.out.println(toString());
	}

}
