package ejercicios;

public class Ejercicio13Arrays {

	public static void main(String[] args) {
		int array[] = new int[5];
		int arrayObjetivo[] = new int[] { 2, 3, 2, 3, 1 };

		do {
			generarNumeros(array);

		} while (compararArrays(array, arrayObjetivo) == false);
		imprimirNumeros(array);
	}

	public static int[] generarNumeros(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 6);
		}
		return array;
	}

	public static void imprimirNumeros(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static boolean compararArrays(int array[], int arrayObjetivo[]) {

		if (array.length != arrayObjetivo.length) {
			return false;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != arrayObjetivo[i]) {
				return false;
			}

		}

		return true;
	}
}
