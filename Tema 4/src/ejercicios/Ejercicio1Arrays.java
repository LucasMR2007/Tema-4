package ejercicios;

public class Ejercicio1Arrays {

	public static void main(String[] args) {

		int numero[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		mostrarArray(numero);
		System.out.println("Cantidad de enteros pares: " +contarParesArray(numero));

	}

	public static void mostrarArray(int numero[]) {
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i] + " ");

		}
		System.out.println();
	}
	

	public static int contarParesArray(int numero[]) {
		int contadorPares = 0;
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 == 0) {
				contadorPares++;
			}
		}
		return contadorPares;

	}

}
