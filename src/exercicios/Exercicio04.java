package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x, e, a;
		int i = 0;
		int t = 0;
		
		System.out.println("Digite um número: ");
		x = leia.nextInt();
				
		while (i < x) {
		System.out.println("Digite um número:");
		e = leia.nextInt();
		
		t = t + e;
		i = i + 1;
		}
	a = t / x;
	
	System.out.println(i);
	System.out.println(a);
	}

}
