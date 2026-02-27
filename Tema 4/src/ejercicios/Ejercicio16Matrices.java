package ejercicios;

public class Ejercicio16Matrices {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		generarMatriz(matriz);
		imprimirmatriz(matriz);
		System.out.println("Hay 5?  ");
		System.out.println(indicarCinco(matriz));

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

	public static boolean indicarCinco(int matriz[][]) {
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				if(matriz[fila][columna]==5) {
					return true;
			
				}
			}
		}
		return false;
	}

	}


