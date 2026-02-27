package Strings;

import java.util.Scanner;

public class Ejercicio6Strings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe una frase para saber cuantas a tiene: ");
		String cadena = teclado.nextLine();
		System.out.println(contarA(cadena));

	}

	public static int contarA(String cadena) {
		char[] array = cadena.toCharArray();
		int contadorA = 0;
		char letra = 'a';
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.toLowerCase(array[i]) == letra) {
				contadorA++;
			}
		}
		return contadorA;
	}

}
