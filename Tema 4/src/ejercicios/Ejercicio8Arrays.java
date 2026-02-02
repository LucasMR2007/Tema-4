package ejercicios;

public class Ejercicio8Arrays {

	public static void main(String[] args) {
		int numeros[] = new int[100];
		generarNumeros(numeros);
		imprimirNumeros(numeros);
		System.out.println(buscarNumeroArray(0, numeros));
		crearArrayComplementario(numeros);

	}

	public static int[] generarNumeros(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 50 + 1);
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
		int k=0;

		for (int i = 1; i <= 50; i++) {
			if (buscarNumeroArray(i, numeros) == true) {
				arrayComp[k] = i;
				k++;
				

			}
		}
		imprimirNumeros(arrayComp);
		
	}

}
