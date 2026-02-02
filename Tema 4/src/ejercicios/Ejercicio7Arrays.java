package ejercicios;

public class Ejercicio7Arrays {

	public static void main(String[] args) {

		int numeros[] = new int[10];

		generarNumeros(numeros);
		imprimirNumeros(numeros);
		System.out.println(buscarNumeroArray(6, numeros));

		System.out.println("Numeros sobrantes: ");
		crearArrayComplementario(numeros);

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
		System.out.println();
	}

	public static boolean buscarNumeroArray(int numero, int numeros[]) {

		for (int i = 0; i < numeros.length; i++) {
			if (numero == numeros[i]) {

				return true;

			}

		}
		return false;
	}

	public static void crearArrayComplementario(int numeros[]) {
		int arrayComp[] = new int[numeros.length];

		for (int i = 1; i <= 10; i++) {
			if (buscarNumeroArray(i, numeros) == true) {
				arrayComp[i - 1] = 0;

			} else if (buscarNumeroArray(i, numeros) == false) {
				arrayComp[i - 1] = i;
			}
		}
		imprimirNumeros(arrayComp);
		
	}

}
