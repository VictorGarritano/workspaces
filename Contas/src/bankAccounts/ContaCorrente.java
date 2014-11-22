package bankAccounts;

public class ContaCorrente extends Conta {
	private double limiteNegativo;

	public double getLimiteNegativo() {
		return limiteNegativo;
	}

	public void setLimiteNegativo(double limiteNegativo) {
		this.limiteNegativo = limiteNegativo;
	}

	@Override
	public void retirada(double sum) {
		// TODO Auto-generated method stub
		if (sum > 0 && this.saldo > this.limiteNegativo) {
			this.saldo -= sum;
		} else if (sum < 0) {
			System.err.println("Retirada: "
					+ "não é possível retirar valor negativo.");
		}

		else {
			System.err
					.println("Retirada: "
							+ "o valor requisitado levará a conta a ultrpassar o limite negativo");

		}
	}

}
