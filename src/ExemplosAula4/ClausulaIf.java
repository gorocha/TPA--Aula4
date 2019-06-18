package ExemplosAula4;

import java.util.Scanner;

class ClausulaIf {

	public static void main(String[] args) {

		Scanner cif = new Scanner(System.in);
		int idade = 0;
		System.out.println("Digite a sua idade: ");
		idade = cif.nextInt();
		if( idade <= 12 ) {
			System.out.println("Criança");
		}
		if( idade > 12 && idade <= 19 ) {
			System.out.println("Adolescente");
		}
		if( idade > 19 && idade <= 60 ) {
			System.out.println("Adulto");
		}
		if( idade > 60 ) {
			System.out.println("Idoso");
		}

	}

}
