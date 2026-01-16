package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2v2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros[] = new int[10];

		for (int i = 1; i < numeros.length; i++) {
			System.out.println("Introduzca un numero: ");
			numeros[i] = teclado.nextInt();

		}
		teclado.close();
		mostrarArray(numeros);

		
		}

	

	public static void mostrarArray(int numero[]) {
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i] + " ");

		}
		System.out.println();
	}

	public static boolean posicion5(int numero[]) {

		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == 5) {
				return true;
			}
		}
		
		return false;
	
	}
}
