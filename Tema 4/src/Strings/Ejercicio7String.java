package Strings;

import java.util.Scanner;

public class Ejercicio7String {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una fecha: ");
		String cadena = teclado.nextLine();
		System.out.println(sumarNumeros(cadena));
		teclado.close();

	}

	public static int sumarNumeros(String cadena) {
		char[] array = cadena.toCharArray();
		int sumaNumeros = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.getNumericValue(array[i]) > 0 && Character.getNumericValue(array[i]) <= 9) {
				sumaNumeros += Character.getNumericValue(array[i]);
			}
		}
		return sumaNumeros;
	}

}
