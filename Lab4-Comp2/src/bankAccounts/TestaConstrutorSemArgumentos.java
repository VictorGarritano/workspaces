package bankAccounts;

public class TestaConstrutorSemArgumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta();
		if (c.getSaldo() == 0.0) {
			System.out
					.println("O contrutor Conta() está funcionando (saldo = 0.0)");
		} else {
			System.out.println("Erro no construtor Conta() - saldo");
		}

		if (c.getNumeroConta() == 0) {
			System.out
					.println("O contrutor Conta() está funcionando(numOfConta = 0)");
		} else {
			System.out.println("Erro no construtor Conta() - numero da conta");
		}

		c.setSaldo(1000);

		if (c.getSaldo() != 0) {
			System.out.println("O saldo foi alterado com sucesso");
		} else {
			System.out.println("Erro ao alterar o saldo");
		}

		c.setNumeroConta(1);

		if (c.getNumeroConta() != 0) {
			System.out.println("Numero da conta alterado com sucesso");
		} else {
			System.out.println("Erro ao alterar o numero da conta");
		}

		c.deposito(100);
		System.out.println(c.getSaldo());
		c.deposito(-1000);
		c.retirada(100);
		System.out.println(c.getSaldo());
		c.retirada(-1000);

		System.out.println(c.toString());

		c.print();

	}

}
