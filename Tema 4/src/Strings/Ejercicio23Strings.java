package Strings;

import java.util.Scanner;

public class Ejercicio23Strings {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String [] palabras = {"aceituna" , "medialuna" , "caseta" , "comino" , "mesa" , "encerado", "lampara" , "castillo" , "abrazo" , "zanco", "hola"};

		int indicePalabra = (int) (Math.random() * 9);
		
		String palabraAdivinar = palabras[indicePalabra];
		char [] letras = new char[10];
		
		int turno = 0;
		String palabraAdivinanza = "";
		do {
			
			
			turno++;
			System.out.println("TURNO " + turno);
			palabraAdivinanza = generarPalabraAdivinanza(letras, palabraAdivinar);
			System.out.println(palabraAdivinanza);
			
			System.out.println("introduzca una letra");
			char letraUsuario = teclado.next().charAt(0);
			
			//ACUMULAR LA LETRA EN ARRAY
			letras[turno - 1] = letraUsuario;
			
			System.out.println("Tras esa letra la palabra adivinanza es: ");
			palabraAdivinanza = generarPalabraAdivinanza(letras, palabraAdivinar);
			System.out.println(palabraAdivinanza);

			
		}while(turno < 10 && !palabraAdivinar.equals(palabraAdivinanza));
		
		if(palabraAdivinanza.equals(palabraAdivinar)) {
			System.out.println("HAS GANADO");
		}else {
			System.out.println("HAS PERDIDO");
		}
			teclado.close();
		
	}
	
	public static String generarPalabraAdivinanza(char[] letras, String palabra) {
		char[] palabraEnCaracteres = palabra.toCharArray();
		String palabraAdivinanza = "";
		for (int i = 0; i < palabraEnCaracteres.length; i++) {
			if (buscarLetra(letras, palabraEnCaracteres[i]) == true) {
				palabraAdivinanza = palabraAdivinanza + palabraEnCaracteres[i];
			} else {
				palabraAdivinanza = palabraAdivinanza + '-';
			}
		}
		
		return palabraAdivinanza;
	}

	public static boolean buscarLetra(char letras[], char buscar) {
		for (int i = 0; i < letras.length; i++) {
			if (Character.toLowerCase(letras[i]) == Character.toLowerCase(buscar)) {
				return true;
			}
		}
		return false;
	}

}
