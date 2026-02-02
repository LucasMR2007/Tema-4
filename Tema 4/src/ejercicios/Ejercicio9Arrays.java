package ejercicios;

public class Ejercicio9Arrays {

	public static void main(String[] args) {
		int numeros[] = new int[10];

		do {
			generarNumeros(numeros);
		} while (sumaNumeros(numeros) != 0);
		imprimirNumeros(numeros);
	}

	public static int[] generarNumeros(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * -21 + 11);
		}
		return numeros;
	}

	public static void imprimirNumeros(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}

	public static int sumaNumeros(int numeros[]) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];

		}

		return suma;
	}
}
