package Practicas;

import java.util.Scanner;

public class Mayuscula {
	/*
	 * Dada una cadena, devuelve una nueva cadena donde los últimos 3 caracteres
	 * están ahora en la parte superior caso. Si la cadena tiene menos de 3
	 * caracteres, mayúscula lo que esté allí. Nota that str.toUpperCase () devuelve
	 * la versión en mayúscula de una cadena.
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
