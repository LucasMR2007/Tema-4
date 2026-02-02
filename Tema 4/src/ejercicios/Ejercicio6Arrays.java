package ejercicios;

public class Ejercicio6Arrays {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		generarArrayy(numeros);
		imprimirNumeros(numeros);
		ordenarArray(numeros);
		imprimirNumeros(numeros);
		ordenarArrayReversa(numeros);
		imprimirNumeros(numeros);

	}

	public static int[] generarArrayy(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
		}
		return array;
	}

	public static void imprimirNumeros(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void ordenarArray(int array[]) {
		int[] arrays = new int[array.length];
		for (int i = 0; i < array.length - 1; i++) {
			int menor = i;

			for (int j = i; j < arrays.length; j++) {
				if (array[j] < array[menor]) {
					menor = j;

				}

			}
			int aux = array[i];
			array[i] = array[menor];
			array[menor] = aux;

		}

	}
	public static void ordenarArrayReversa(int array[]) {
		int[] arrays = new int[array.length];
		for (int i = 0; i < array.length - 1; i++) {
			int mayor = i;

			for (int j = i; j < arrays.length; j++) {
				if (array[j] > array[mayor]) {
					mayor=j;

				}

			}
			int aux = array[i];
			array[i] = array[mayor];
			array[mayor] = aux;

		}

	}

}
