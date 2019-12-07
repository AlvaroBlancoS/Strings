package Practicas;

import java.util.Scanner;

public class replace {
	/*
	 * Escriba un programa Java para modificar su entrada en su lugar. Reemplazar la
	 * subcadena con los siguientes caracteres como se muestra a continuación:
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the URL :");
		String s = sc.nextLine();
		replace obj = new replace();
		s = obj.decodeURL(s);

		System.out.print("Decoded URL is :" + s);
	}
	// {write your code here
	// }

	private String decodeURL(String s) {
//		String respuesta = s;
//		s = s.replaceAll("%20", " ");
//		s = s.replaceAll("%3A", "?");
//		s = s.replaceAll("%3D", ".");
		
		return s.replaceAll("%20", " ").replaceAll("%3A", "?").replaceAll("%3D", ".");
	}

}
