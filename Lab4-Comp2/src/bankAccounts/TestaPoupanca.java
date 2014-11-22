package bankAccounts;

public class TestaPoupanca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(1000);
		System.out.println("O saldo da conta eh: " + cp.getSaldo());
		cp.setNumeroConta(101);
		System.out.println("O numero da conta eh: " + cp.getNumeroConta());
		cp.setJuros(0.045);
		System.out
				.println("Taxa de juros adicionada a conta: " + cp.getJuros());
		System.out.println("O montante com juros adicionado é: "
				+ cp.adicionaJuros());
		System.out.println("O novo saldo da conta com os juros eh: " + cp.getSaldo());
		cp.deposito(1000);
		cp.print();
		cp.deposito(-100);
		cp.retirada(110);
		cp.print();
		cp.retirada(-10000);
		cp.print();
	}

}
