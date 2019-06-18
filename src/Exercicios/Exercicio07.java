package Exercicios;

import java.util.Scanner;

class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner ex7 = new Scanner(System.in);
		
		double n1;
		System.out.println("Digite o primeiro número: ");
		n1 = ex7.nextDouble();
		double n2;
		System.out.println("Digite o primeiro número: ");
		n2 = ex7.nextDouble();
		
		int es;
		System.out.println("Escolha um operador: 1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
		es = ex7.nextInt();
		
		if(es == 1) {
			System.out.println(n1 + n2);
		}
		if(es == 2) {
			System.out.println(n1 - n2);
		}
		if(es == 3) {
			System.out.println(n1 * n2);
		}
		if(es == 4) {
			System.out.println(n1 / n2);
		}
		
	}

}
