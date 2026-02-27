package Strings;

import java.util.Scanner;

public class Ejercico17Strings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		char corazon= 9825;
		frase= frase.replace('a', corazon);
		frase= frase.replace('A', corazon);
		System.out.println(frase);
	}

	
}
