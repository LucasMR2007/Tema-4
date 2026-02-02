package ejercicios;

import java.util.Scanner;

public class Ejercicio5Arrays {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Introduce 10 numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = teclado.nextInt();

		}
		imprimirArrays(numeros);
		System.out.println("El invertido es: ");
		invertirArray(numeros);
		invertirArrayV2(numeros);
	}

	public static void imprimirArrays(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");

		}
		System.out.println();
	}

	public static int[] invertirArray(int numeros[]) {
		int[] arrayInvertido = new int[numeros.length];
		int j = numeros.length - 1;
		for (int i = 0; i < numeros.length; i++) {
			arrayInvertido[i] = numeros[j];
			j--;
		}
		imprimirArrays(arrayInvertido);
		return arrayInvertido;

	}

	public static int[] invertirArrayV2(int numeros[]) {
		int i = 0;
		int j = numeros.length - 1;
		int aux; 
		while(i<j) {
			aux=numeros[i];
			numeros[i]=numeros[j];
			numeros[j]= aux;
			j--;
			i++;
		}
		imprimirArrays(numeros);
		return numeros;
	}
}
