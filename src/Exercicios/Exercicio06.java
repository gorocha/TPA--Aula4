package Exercicios;

import java.util.Scanner;


class Exercicio06 {

	public static void main(String[] args) {
		Scanner ex6 = new Scanner(System.in);
		
		int n;
		System.out.println("Digite um n�mero: ");
		n = ex6.nextInt();
		
		if((n % 2) == 0) {
			System.out.println("O n�mero " + n + " � par.");
		}
		else {
			System.out.println("O n�mero " + n + " � impar.");
		}

	}

}
