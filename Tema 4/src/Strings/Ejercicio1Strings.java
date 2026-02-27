package Strings;

public class Ejercicio1Strings {

	public static void main(String[] args) {
		String[] mensajes = { "Pato", "Cielo", "Montaña", "Río", "Sol", "Playa", "Pato", "Familia", "Amistad", "Pato" };
		encontrarPatos(mensajes);
	}

	public static void encontrarPatos(String mensajes[]) {
		int contadorPatos = 0;
		for (int i = 0; i < mensajes.length; i++) {
			if (mensajes[i] == "Pato") {
				contadorPatos++;
			}
		}
		System.out.println(contadorPatos);
	}

}
