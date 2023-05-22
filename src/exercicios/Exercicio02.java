package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Para continuar, difite sua senha:");
		String senha = leia.next();
		
		int i = 0;
		while (!senha.equals("a6b54")){
				System.out.println("Senha invalida");				
				i++;
				System.out.println("Para continuar, difite sua senha:");	
				senha = leia.next();
				
		}
		System.out.println("Seja bem-vindo(a) á área do cliente!");

	}

}
