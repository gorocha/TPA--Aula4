package Exercicios;

import java.util.Scanner;

class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner ex5 = new Scanner(System.in);
		
		double um = 0;
		System.out.println("Digite o primeira n�mero: ");
		um = ex5.nextInt();
		double dois = 0;
		System.out.println("Digite o segundo n�mero: ");
		dois = ex5.nextInt();
		double tres = 0;
		System.out.println("Digite o terceiro n�mero: ");
		tres = ex5.nextInt();
		
		if(um > dois && um > tres) {
			System.out.println(um + " � o maior n�mero");
		}
		if(dois > um && dois > tres) {
			System.out.println(dois + " � o maior n�mero");
		}
		if(tres > um && tres > dois) {
			System.out.println(tres + " � o maior n�mero");
		}
		

	}

}
