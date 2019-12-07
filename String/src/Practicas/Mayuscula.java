package Practicas;

import java.util.Scanner;

public class Mayuscula {
	/*
	 * Dada una cadena, devuelve una nueva cadena donde los �ltimos 3 caracteres
	 * est�n ahora en la parte superior caso. Si la cadena tiene menos de 3
	 * caracteres, may�scula lo que est� all�. Nota that str.toUpperCase () devuelve
	 * la versi�n en may�scula de una cadena.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scanner.next();
		int longitud = s.length();
		if (longitud <= 3) {
			s = s.toUpperCase();
		} else {
			String aux = s.substring(longitud - 3).toUpperCase();
			s = s.substring(0, longitud - 3) + aux;
		}
		System.out.println(s);
	}

}
