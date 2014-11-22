package bankAccounts;

public class ContaPoupanca extends Conta {
	private double juros;
	
	
	
	public double adicionaJuros() {
		return this.saldo * this.getJuros();
	}



	public double getJuros() {
		return juros;
	}



	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	@Override
	public double getSaldo() {
		return saldo = this.saldo + this.adicionaJuros();
	}
}
