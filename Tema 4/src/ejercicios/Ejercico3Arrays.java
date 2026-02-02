package ejercicios;

import java.util.Arrays;

public class Ejercico3Arrays {

	public static void main(String[] args) {

		int numeros[] = new int[10];

		generarNumeros(numeros);
		imprimirNumeros(numeros);
		numeroMayor(numeros);
		System.out.println(numeroMayor(numeros));
		System.out.println("La suma de los numeros es: " + sumaNumeros(numeros));
		System.out.println("La media de los numeros es: " + mediaNumeros(numeros));

	}

	public static int[] generarNumeros(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10 + 1);

		}
		return numeros;
	}

	public static void imprimirNumeros(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

	public static int numeroMayor(int numeros[]) {
		Arrays.sort(numeros);
		return numeros[numeros.length - 1];

	}

	public static int numeroMenor(int numeros[]) {
		Arrays.sort(numeros);
		return numeros[0];

	}

	public static int sumaNumeros(int numeros[]) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		return suma;
	}

	public static float mediaNumeros(int numeros[]) {
		float media = (float) sumaNumeros(numeros) / numeros.length;
		return media;
	}

}
