package Strings;

import java.util.Scanner;

public class Ejercicio11Strings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra1 = teclado.next().toLowerCase();
		System.out.println("Introduce una palabra");
		String palabra2 = teclado.next().toLowerCase();
		teclado.close();

		System.out.println(ordernarPalabra1(palabra1));
		System.out.println(ordernarPalabra1(palabra2));
		System.out.println(compararPalabras(palabra1, palabra2));

	}

	public static String ordernarPalabra1(String palabra1) {
		char[] caracter1 = palabra1.toCharArray();

		for (int i = 0; i < caracter1.length; i++) {
			int menor = i;
			for (int j = i; j < caracter1.length; j++) {
				if (caracter1[j] < (caracter1[menor])) {
					menor = j;
				}
			}
			char aux = caracter1[i];
			caracter1[i] = caracter1[menor];
			caracter1[menor] = aux;
		}
		return new String(caracter1);

	}

	public static boolean compararPalabras(String palabra1, String palabra2) {
		char[] caracter1 = palabra1.toCharArray();
		char[] caracter2 = palabra2.toCharArray();

		for (int i = 0; i < palabra1.length(); i++) {

			if (caracter1[i] == (caracter2[i])) {
				return true;
			}
		}

		return false;

	}

}
