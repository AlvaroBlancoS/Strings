package Ejercicios;

import java.util.Scanner;

public class CuantasVocales {

	int cuantasVocales(String palabra) {
		String dato = palabra.toLowerCase();
		int contador = 0;
		for (int x = 0; x < dato.length(); x++) {
			if ((dato.charAt(x) == 'a') || (dato.charAt(x) == 'e') || (dato.charAt(x) == 'i') || (dato.charAt(x) == 'o')
					|| (dato.charAt(x) == 'u')) {
				contador++;
			}

		}
		return contador;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texto = in.nextLine();
		CuantasVocales vocales = new CuantasVocales();

		System.out.println(vocales.cuantasVocales(texto));

	}

}
