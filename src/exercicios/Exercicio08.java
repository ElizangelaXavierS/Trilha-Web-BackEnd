package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("--- Moisés, bem-vindo ao app poupança ---");

		int i = 1;
		float valor;
		float saldo = 1000;
		float poupanca = 500;

		while (i != 3) {
			System.out.println("*********************");
			System.out.println("     [1] Aplicar     ");
			System.out.println("     [2] Resgatar    ");
			System.out.println("     [3] Sair        ");
			System.out.println("*********************");
			int opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Valor da aplicação: ");
				valor = leia.nextFloat();

				if (valor > saldo) {
					System.out.println("Saldo de conta corrente insuficiente! ");
				} else {
					saldo = saldo - valor;
					poupanca = poupanca + valor;
					System.out.println("Aplicação realizada com sucesso!");
				}
				break;
			case 2:
				System.out.println("valor do resgate: ");
				valor = leia.nextFloat();

				if (valor > poupanca) {
					System.out.println("Saldo da poupança insuficiente! ");
				} else {
					saldo = saldo + valor;
					poupanca = poupanca - valor;
					System.out.println("Resgate  realizado com sucesso!");
				}
				break;
			case 3:
				System.out.println("Você saiu de sua conta. Volte sempre");
				break;
			default: {
				System.out.println("Opçãp inválida!");
			}
			}
		}

	}

}
