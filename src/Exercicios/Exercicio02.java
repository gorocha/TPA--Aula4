package Exercicios;

import java.util.Scanner;

class Exercicio02 {

	public static void main(String[] args) {
		Scanner ex2 = new Scanner(System.in);
		
		float p = 0;
		System.out.println("Digite um n�mero qualquer: ");
		p = ex2.nextFloat();
		if(p >= 1.99 && p <= 5.99 ) {
			System.out.println(p + " est� entre 1,99 e 5,99");
		}
		else {
			System.out.println(p + " n�o est� entre 1,99 e 5,99");
		}

	}

}
