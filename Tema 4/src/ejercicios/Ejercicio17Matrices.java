package ejercicios;

import java.util.Arrays;

public class Ejercicio17Matrices {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];

		generarMatriz(matriz);
		imprimirMatriz(matriz);
		numeroMayor(matriz);
		numeroMayor(matriz);
		System.out.println("La suma de los numeros es: " + sumaMatriz(matriz));
		System.out.println("La media de los numeros es: " + mediaMatriz(matriz));

	}

	public static int[][] generarMatriz(int matriz[][]) {
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				matriz[fila][columna] = (int) (Math.random() * 9 + 1);
			}
		}
		return matriz;
	}

	public static void imprimirMatriz(int matriz[][]) {
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.print(matriz[fila][columna] + " ");
			}
			System.out.println();
		}

	}

	public static void numeroMayor(int matriz[][]) {
		for (int fila = 0; fila < matriz.length; fila++) {
			Arrays.sort(matriz[fila]);
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				Arrays.sort(matriz[columna]);
				System.out.println("El numero mas grande es: " + matriz[matriz.length - 1][matriz.length - 1]);

			}
		}
	}

	public static int numeroMenor(int matriz[]) {
		Arrays.sort(matriz);
		return matriz[0];

	}

	public static int sumaMatriz(int matriz[][]) {
		int suma = 0;
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				suma += matriz[fila][columna];
			}

		}
		return suma;
	}

	public static float mediaMatriz(int matriz[][]) {
		float media = (float) sumaMatriz(matriz) / matriz.length;
		return media;
	}
}
