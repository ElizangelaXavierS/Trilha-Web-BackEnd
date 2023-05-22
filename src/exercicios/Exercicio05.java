package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		int n = 5;

		float[] v = new float[5];
		float[] u = new float[5];
		v[0] = 2.0f;
		v[1] = 3.0f;
		v[2] = 4.0f;
		v[3] = 5.0f;
		v[4] = 6.0f;

	

		for (int i = 0; i < n; i++) {
			u[i] = v[i] * i;
		}
		System.out.println(u[1] + " , "+ u[3]);
	}
}
