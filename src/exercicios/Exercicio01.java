package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um número:");
		int a = leia.nextInt();	
		
		System.out.println("Digite um número:");
		int b = leia.nextInt();	
		
		int res = a * b;
		
		System.out.println(res);
	}

}
