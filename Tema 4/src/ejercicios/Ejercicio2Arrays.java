package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2Arrays {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros[]= new int[10];
		
		for (int i = 1; i < numeros.length; i++) {
			System.out.println("Introduzca un numero: ");
			numeros[i]=teclado.nextInt();
			
		}
		teclado.close();
		Arrays.sort(numeros);
		mostrarArray(numeros);
		int posicion5= Arrays.binarySearch(numeros, 5);
		System.out.println(posicion5);
		
	}
	public static void mostrarArray(int numero[]) {
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i] + " ");

		}
		System.out.println();
	}
}
