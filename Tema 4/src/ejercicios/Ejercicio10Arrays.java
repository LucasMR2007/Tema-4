package ejercicios;

import java.util.Arrays;

public class Ejercicio10Arrays {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		int numeros2[] = new int[10];
		System.out.println("Array 1: ");
		generarNumeros(numeros);
		imprimirNumeros(numeros);
		System.out.println("Array 2: ");
		generarNumeros(numeros2);
		imprimirNumeros(numeros2);
		System.out.println("Array suma: ");
		sumaArrays(numeros, numeros2);
		System.out.println("Array 1 ordenado: ");
		ordenarArray(numeros);
		imprimirNumeros(numeros);
		System.out.println("Array 2 ordenado: ");
		ordenarArray(numeros2);
		imprimirNumeros(numeros2);

	}

	public static int[] generarNumeros(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10 + 1);
		}
		return numeros;
	}

	public static int[] generarNumeros2(int numeros2[]) {
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i] = (int) (Math.random() * 10 + 1);
		}
		return numeros2;
	}

	public static void imprimirNumeros(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}

	public static int[] ordenarArray(int numeros[]) {
		Arrays.sort(numeros);
		return numeros;

	}

	public static void sumaArrays(int numeros[], int numeros2[]) {
		int arrayConcat[] = new int [numeros.length + numeros2.length];
		int aux=0;
		for (int i = 0; i < numeros.length; i++) {
			arrayConcat[aux]=numeros[i];
			aux++;
			
		
		}
		
		
		for (int j = 0; j < numeros2.length; j++) {
			arrayConcat[aux]=numeros2[j];
			aux++;
		
		}
		Arrays.sort(arrayConcat);
		imprimirNumeros(arrayConcat);
		
			

	}
}
