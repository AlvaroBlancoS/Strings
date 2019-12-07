package Ejercicios;

import java.util.Scanner;

public class GenerarUsuario {
	static String generarUsuario(String[] datos) {

		String nombreAcortado = "";
		if (datos[0].length() > 3) {
			nombreAcortado = datos[0].substring(0, 3);
		} else {
			nombreAcortado = datos[0];
		}
		// Ahora, nombreAcortado tiene el formato que queremos: si ponemos alfredo,
		// nombreAcortado=alf
		String apellidoUnoAcortado = "";
		if (datos[1].length() > 3) {
			apellidoUnoAcortado = datos[1].substring(0, 3);
		} else {
			apellidoUnoAcortado = datos[1];
		}
		String apellidoDosAcortado = "";
		if (datos[2].length() > 3) {
			apellidoDosAcortado = datos[2].substring(0, 3);
		} else {
			apellidoDosAcortado = datos[2];
		}
		String user = (apellidoUnoAcortado + apellidoDosAcortado + nombreAcortado).toUpperCase();

		return user;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] usuario = new String[3];
		usuario[0] = in.nextLine();//Nombre 
		usuario[1] = in.nextLine();//Primer Apellido
		usuario[2] = in.nextLine();//Segundo Apellido
		String resultado = generarUsuario(usuario);
		System.out.println(resultado);
	}
}
