package Ejercicios;

import java.util.Scanner;

public class ComparacionCadenas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese la primera cadena: ");
		String cadena1 = in.nextLine();
		System.out.print("Ingrese la segunda cadena: ");
		String cadena2 = in.nextLine();

		System.out.println("Estamos comparando las cadenas si ambas son mayusculas o minusculas ");

		if (cadena1.equals(cadena2) == true) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas no son iguales");
		}

		System.out.println("Estamos comparando las cadenas sin tener en cuenta que ambas son mayusculas y minusculas ");

		if (cadena1.equalsIgnoreCase(cadena2) == true) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas no son iguales");
		}

	}

}
