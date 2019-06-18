package ExemplosAula4;

import java.util.Scanner;

class ClausulaSwitch {

	public static void main(String[] args) {

		Scanner clswitch = new Scanner(System.in);
		int numero = 0;
		System.out.println("Digite um número de um a três");
		numero = clswitch.nextInt();
		switch ( numero ) {
		case 1:
			System.out.println("UM");
			break;
		case 2:
			System.out.println("DOIS");
			break;
		case 3:
			System.out.println("TRÊS");
			break;
		default:
			System.out.println("NENHUM");
			break;
		}
			

	}

}
