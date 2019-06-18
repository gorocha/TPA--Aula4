package ExemplosAula4;

import java.util.Scanner;

class ClausulaIf2 {

	public static void main(String[] args) {

		Scanner cif2 = new Scanner(System.in);
		int idade = 0;
		System.out.println("Digite a sua idade: ");
		idade = cif2.nextInt();
		if( idade <= 12 ) {
			System.out.println("Criança");
		}
		else if( idade <= 19 ) {
			System.out.println("Adolescente");
		}
		else if( idade <= 60 ) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}

	}

}
