package ejercicios;

import java.util.Arrays;

public class Grupo {

	private Alumno[] alumnos = new Alumno[10];
	private String[] nombres = { "Juan", "María", "Luisa", "Mario", "Carmen", "Pedro", "Marcos", "Lucía", "Lucas",
			"Sara" };

	public Grupo() {
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Alumno(nombres[i]);
		}
	}

	public void ordenarAlumnosNota() {
		for (int i = 0; i < alumnos.length - 1; i++) {

			int mayor = i;

			for (int j = i; j < alumnos.length; j++) {
				if (alumnos[j].calcularMedia() > alumnos[mayor].calcularMedia()) {
					mayor = j;
				}
			}

			Alumno aux = alumnos[i];
			alumnos[i] = alumnos[mayor];
			alumnos[mayor] = aux;

		}
	}

	@Override
	public String toString() {
		return "Grupo [ \n alumnos=" + Arrays.toString(alumnos) + "]";
	}

}