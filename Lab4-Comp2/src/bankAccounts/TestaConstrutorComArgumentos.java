package bankAccounts;

public class TestaConstrutorComArgumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta(10);
		if (c.getSaldo() == 0.0) {
			System.out
					.println("O contrutor Conta(numeroDaConta) está funcionando (saldo = 0.0)");
		} else {
			System.out
					.println("Erro no construtor Conta(numeroDaConta) - saldo");
		}

		if (c.getNumeroConta() != 0) {
			System.out
					.println("O contrutor Conta(numeroDaConta) está funcionando. O numero da conta eh: "
							+ c.getNumeroConta());
		} else {
			System.out
					.println("Erro no construtor Conta(numeroDaConta) - numero da conta");
		}

		c.setSaldo(1000);

		if (c.getSaldo() != 0) {
			System.out.println("O saldo foi alterado com sucesso");
		} else {
			System.out.println("Erro ao alterar o saldo");
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
