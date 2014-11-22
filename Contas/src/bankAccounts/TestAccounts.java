package bankAccounts;

public class TestAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.setnumeroConta(87625);
		conta.setsaldo(3907.47);
		System.out.println("O saldo da conta nº " + conta.getNumeroConta()
				+ " é: " + conta.getsaldo());
		conta.deposito(233.86);
		System.out.println("O saldo da conta nº " + conta.getNumeroConta()
				+ " é: " + conta.getsaldo());
		conta.deposito(-87.0);
		conta.retirada(98.24);
		System.out.println("O saldo da conta nº " + conta.getNumeroConta()
				+ " é: " + conta.getsaldo());
		conta.retirada(-222.02);
		System.out.println(conta.toString());
		conta.print();

	}

}
