package Strings;

import java.util.Scanner;

public class Ejercicio12Strings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		
		System.out.print("Ingrese una palabra: ");
		String palabra = teclado.next();
		System.out.print("Ingrese el numero de desfase: ");
		int desfase = teclado.nextInt();

		do {
			System.out.println("---MENU---");
			System.out.println("0) SALIR DEL PROGRAMA");
			System.out.println("1) CIFRAR");
			System.out.println("2) DESCIFRAR");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 0: 
				System.out.println("Hasta pronto!!");
			case 1:
				System.out.print("Palabra cifrada: ");
				System.out.println(cifrarPalabra(palabra, desfase));
				break;
			case 2:
				System.out.print("Palabra descifrada: ");
				System.out.println(descifrarPalabra(palabra, desfase));
				break;

			default:
				break;
			}

		} while (opcion != 0);
	

	}

	public static String cifrarPalabra(String palabra, int desfase) {
		palabra = palabra.toLowerCase();
		String palabraCifrada = "";

		for (int i = 0; i < palabra.length(); i++) {
			char letraCifrada = (char) (palabra.charAt(i) + desfase);
			if (letraCifrada > 'z') {
				letraCifrada = (char) ('a' + (letraCifrada - 'z' - 1));
			}
			palabraCifrada += letraCifrada;

		}
		return palabraCifrada;

	}

	public static String descifrarPalabra(String palabra, int desfase) {
		palabra = palabra.toLowerCase();
		String palabraCifrada = "";

		for (int i = 0; i < palabra.length(); i++) {
			char letraCifrada = (char) (palabra.charAt(i) - desfase);
			if (letraCifrada < 'a') {
				letraCifrada = (char) ('z' + (letraCifrada - 'a' + 1));
			}
			palabraCifrada += letraCifrada;

		}
		return palabraCifrada;

	}
}