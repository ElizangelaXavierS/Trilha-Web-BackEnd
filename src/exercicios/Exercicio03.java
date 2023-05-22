package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float res;
		System.out.println("Digite um número positivo");
		float x1 = leia.nextFloat();

		System.out.println("Digite outro número positivo");
		float x2 = leia.nextFloat();

		if (x1 > x2) {
			res = (x1 - x2) / x1;
		} else {
			res = (x2 - x1) / x2;
		}
		System.out.println(res);
	}
}
