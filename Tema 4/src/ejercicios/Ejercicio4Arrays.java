package ejercicios;

import java.util.Scanner;

public class Ejercicio4Arrays {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Introduce 10 numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = teclado.nextInt();
		}

		imprimirArrays(numeros);
		System.out.println(comprobarOrden(numeros));
	}

	public static void imprimirArrays(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");

		}
		System.out.println();
	}

	public static boolean comprobarOrden(int numeros[]) {
		
		for (int i = 0; i < numeros.length -1 ; i++) {
			if(numeros[i] > numeros[i+1]) {
				return false;
			}
		}
		return true;

	}
}
