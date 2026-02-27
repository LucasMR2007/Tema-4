package Strings;

import java.util.Scanner;

public class Ejercicio13Strings {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		System.out.print("Introduce el numero de rotaciones: ");
		int rotaciones = teclado.nextInt();
		while (rotaciones < 1 || rotaciones > frase.length()) {
			System.out.print("Volver a introducir numero de rotaciones: ");
			rotaciones = teclado.nextInt();

		}

		System.out.print("Resultado despues de las rotaciones: ");

		String subtexto = frase.substring(0, rotaciones);
		String subtexto2 = frase.substring(rotaciones, frase.length());
		System.out.println(subtexto2 + subtexto);

	}

}
