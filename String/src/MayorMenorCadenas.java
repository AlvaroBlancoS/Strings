package Ejercicios;

import java.util.Scanner;

public class MayorMenorCadenas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe la primera cadena: ");
		String cadena1 = in.nextLine();
		System.out.print("Escribe la segunda cadena: ");
		String cadena2 = in.nextLine();

		if (cadena1.compareTo(cadena2) == 0) {
			System.out.println("Es exactmente igual ");
		} else {
			if (cadena1.compareTo(cadena2) > 0) {
				System.out.println(cadena2 + " es mayor alfabeticamente que " + cadena1);
			} else {
				System.out.println(cadena1 + " es mayor alfabeticamente que " + cadena2);
			}
		}

		int cantidad = cadena1.length();
		int cantidad2 = cadena2.length();
		System.out.println("cantidad de caracteres es " + cadena1 + " es " + cantidad + "\ny cantidad de caracteres es "
				+ cadena2 + " es " + cantidad2);

	}

}
