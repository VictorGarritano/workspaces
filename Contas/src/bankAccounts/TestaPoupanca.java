package bankAccounts;

public class TestaPoupanca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaPoupanca cp = new ContaPoupanca();
		cp.setnumeroConta(8725);
		cp.setsaldo(39074.47);
		System.out.println("O saldo da conta nº " + cp.getNumeroConta()
				+ " é: " + cp.getsaldo());
		cp.setJuros(0.045);
		cp.setsaldo();
		System.out.println("O valor do juros é: " + cp.getJuros());
		System.out.println("O valor add pelo juros é: " + cp.adicionaJuros());
		System.out.println("O saldo da conta nº " + cp.getNumeroConta()
				+ " é: " + cp.getsaldo());
		cp.deposito(233.86);
		System.out.println("O saldo da conta nº " + cp.getNumeroConta()
				+ " é: " + cp.getsaldo());
		System.out.println("O juros atribuido a conta: " + cp.getNumeroConta()
				+ " é: " + cp.getJuros());
		cp.deposito(-87.0);
		cp.retirada(98.24);
		System.out.println("O saldo da conta nº " + cp.getNumeroConta()
				+ " é: " + cp.getsaldo());
		cp.retirada(-222.02);
		System.out.println(cp.toString());

	}

}