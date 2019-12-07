package Practicas;

import java.util.Scanner;

public class HayMayuscula {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduzca un texto: ");
		String texto = in.nextLine();
		boolean res = false;
		for (int i = 0; i < texto.length(); i++) {
			if (Character.isUpperCase(texto.charAt(i))) {
				res = true;
			} 
		}
		
		System.out.println(res?"Hay mayuscula":"No hay");
	
	}

}
