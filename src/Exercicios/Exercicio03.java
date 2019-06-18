package Exercicios;

import java.util.Scanner;

class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ex3 = new Scanner(System.in);
		
		int numero = 0;
		System.out.println("Digite um número: ");
		numero = ex3.nextInt();
		switch(numero) {
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3: 
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		
		}

	}

}
