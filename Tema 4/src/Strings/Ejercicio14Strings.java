package Strings;

import java.util.Scanner;

public class Ejercicio14Strings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		String numero = teclado.next();

		System.out.println("El numero es: " + numero);
		String entera = numero.substring(0, numero.length() - 3);
		String decimal = numero.substring(numero.length() - 2, numero.length());
		System.out.print(formatearEntera(entera)+ "." + decimal);

	}

	public static String formatearEntera(String entera) {
		String nuevoNum = "";
		int contador = 0;
		for (int i = entera.length() - 1; i >= 0; i--) {
			contador++;
			nuevoNum = entera.charAt(i) + nuevoNum;
			if (contador > 2) {
				nuevoNum = ',' + nuevoNum ;
				contador = 0;

			}
		}
		if(nuevoNum.charAt(0) == ',') {
			nuevoNum = nuevoNum.substring(1, nuevoNum.length());
		}

		return nuevoNum;

	}

}
