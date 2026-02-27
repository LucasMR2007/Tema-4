package ejercicios;

public class Ejercicio15Matrices {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		generarMatriz(matriz);
		imprimirmatriz(matriz);
		System.out.print("Contador pares: ");
		indicarPares(matriz);

	}

	public static int[][] generarMatriz(int matriz[][]) {
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				matriz[fila][columna] = (int) (Math.random() * 9 + 1);
			}
		}
		return matriz;
	}

	public static void imprimirmatriz(int matriz[][]) {
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.print(matriz[fila][columna] + " ");
			}
			System.out.println();
		}

	}

	public static void indicarPares(int matriz[][]) {
		int contarPares = 0;
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				if(matriz[fila][columna]%2==0) {
					contarPares++;
				}
			}
		}
		System.out.print(contarPares);
	}
}
