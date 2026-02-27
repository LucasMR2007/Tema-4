package Strings;

import java.util.Scanner;

public class Ejercicio16Strings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		System.out.println(contarVocales(frase));

	}

	public static int contarVocales(String frase) {
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A' || frase.charAt(i) == 'e' || frase.charAt(i) == 'E'
					|| frase.charAt(i) == 'i' || frase.charAt(i) == 'I' || frase.charAt(i) == 'o'
					|| frase.charAt(i) == 'O' || frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
				contador++;

			}
		}
		return contador;
	}
}
