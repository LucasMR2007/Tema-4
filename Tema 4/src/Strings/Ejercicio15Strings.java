package Strings;

import java.util.Scanner;

public class Ejercicio15Strings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		System.out.println(cambiarA(frase));

	}

	public static String cambiarA(String frase) {
		String nuevaFrase = "";
		char corazon = 9825;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
				nuevaFrase= nuevaFrase + corazon;
				

			} else {
				nuevaFrase += frase.charAt(i);
			}
		}
		return nuevaFrase;
	}

}
