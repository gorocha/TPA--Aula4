package Exercicios;

import java.util.Scanner;

class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ex4 = new Scanner(System.in);
		
		double n1 = 0;
		System.out.println("Digite a primeira nota: ");
		n1 = ex4.nextInt();
		double n2 = 0;
		System.out.println("Digite a primeira nota: ");
		n2 = ex4.nextInt();
		double n3 = 0;
		System.out.println("Digite a primeira nota: ");
		n3 = ex4.nextInt();
		double n4 = 0;
		System.out.println("Digite a primeira nota: ");
		n4 = ex4.nextInt();
		double ma = (n1 + n2 + n3 + n4)/4;
		
		if(ma >= 6) {
			System.out.println("Aprovado");
		}
		if(ma < 3) {
			System.out.println("Retido");
		}
		if(ma >= 3 && ma < 6) {
			System.out.println("Exame");
		}

	}

}