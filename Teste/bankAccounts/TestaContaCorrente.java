package bankAccounts;

public class TestaContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente();
		cc.setnumeroConta(87625);
		cc.setsaldo(3907.47);
		System.out.println("O saldo da conta nº " + cc.getNumeroConta()
				+ " é: " + cc.getsaldo());
		cc.setLimiteNegativo(-2000.50);
		System.out.println("O limite negativo da conta " + cc.getNumeroConta()
				+ " é: " + cc.getLimiteNegativo());
		cc.deposito(233.86);
		System.out.println("O saldo da conta nº " + cc.getNumeroConta()
				+ " é: " + cc.getsaldo());
		cc.deposito(-87.65);
		cc.retirada(4000);
		cc.print();
		cc.retirada(408.24);
		System.out.println("O saldo da conta nº " + cc.getNumeroConta()
				+ " é: " + cc.getsaldo());
		cc.retirada(676);
		cc.retirada(600.59);
		cc.print();
		cc.retirada(-558.32);
		cc.print();
		System.out.println(cc.toString());
		cc.print();
	}

}
