package ejercicios;

import java.util.Scanner;

public class Ejercicio12Arrays {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int array[] = new int[10];
		int posicion;
		System.out.println("Array 1: ");
		generarArray(array);
		imprimirNumeros(array);
		do {
			System.out.println("Introduzca posicion que desea borrar");
			posicion = teclado.nextInt();
			array=borrarPosicion(array, posicion);

		} while (posicion >= 0 && posicion <= 9);
		System.out.println("Saliendo del programa");
		teclado.close();

	}

	public static int[] generarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
		}
		return array;
	}

	public static void imprimirNumeros(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}

	public static int[] borrarPosicion(int[] array, int posicion) {
		int[] nuevoArray = new int[array.length - 1];
		if (posicion < 0 || posicion > 9) {
			System.out.println("Error");
		} else {
			
			int contador = 0;
			for (int i = 0; i < array.length; i++) {
				if (i != posicion) {
					nuevoArray[contador] = array[i];
					contador++;

				}

			}
			imprimirNumeros(nuevoArray);
		}
		
		return nuevoArray;
	}
}