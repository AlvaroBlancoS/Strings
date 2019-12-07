package Ejercicios;

import java.util.Scanner;

public class Palindromo {
	static boolean esPalindromo(String dato) {
		// hola soy alvaro
		String texto = dato.toLowerCase().replace(" ", "");
		// texto=holasoyalvaro
		int fin = texto.length() - 1;
		int ini = 0;
		boolean espalin = true;
		while ((ini < fin) && (espalin == true)) {
			if (texto.charAt(ini) != texto.charAt(fin)) {
				espalin = false;
			}
			ini++;
			fin--;
		}
		return espalin;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texto = in.nextLine();// hola soy alvaro
		boolean palindromo = esPalindromo(texto);

		if (palindromo) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}

}
