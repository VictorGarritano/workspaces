package bankAccounts;

public class ContaPoupanca extends Conta {
	private double juros;

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double adicionaJuros() {
		return this.saldo * this.getJuros();
	}

	public void setsaldo() {
		this.saldo = saldo + this.adicionaJuros();
	}

}
