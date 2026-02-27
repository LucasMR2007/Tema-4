package Strings;

import java.util.Scanner;

public class Ejercicio8Strings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una fecha: ");
		String cadena = teclado.nextLine();
		//System.out.println(imprimirNumerosAlReves(cadena));
		teclado.close();

	}

	/*public static int imprimirNumerosAlReves(String cadena) {
		char[] array = cadena.toCharArray();
		for (int i = cadena.length(); i > 0; i--) {
			System.out.println();
		}

	}*/
}
