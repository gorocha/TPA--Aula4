package Exercicios;

import java.util.Scanner;

class Exercicio01 {

	public static void main(String[] args) {
		Scanner ex1 = new Scanner(System.in);
		
		int numero = 0;
		System.out.println("Digite um n�mero: ");
		numero = ex1.nextInt();
		if(numero < 15) {
			System.out.println("O n�mero � menor que 15");
		}
		if(numero > 100) {
			System.out.println("O n�mero � maior que 100");
		}

	}

}
