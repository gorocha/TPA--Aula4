package Exercicios;

import java.util.Scanner;

class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner ex5 = new Scanner(System.in);
		
		double um = 0;
		System.out.println("Digite o primeira número: ");
		um = ex5.nextInt();
		double dois = 0;
		System.out.println("Digite o segundo número: ");
		dois = ex5.nextInt();
		double tres = 0;
		System.out.println("Digite o terceiro número: ");
		tres = ex5.nextInt();
		
		if(um > dois && um > tres) {
			System.out.println(um + " é o maior número");
		}
		if(dois > um && dois > tres) {
			System.out.println(dois + " é o maior número");
		}
		if(tres > um && tres > dois) {
			System.out.println(tres + " é o maior número");
		}
		

	}

}
