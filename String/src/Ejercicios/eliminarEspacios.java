package Ejercicios;

import java.util.Scanner;

public class eliminarEspacios {

	 String eliminarEspacios(String dato) {
		String texto = dato.replace(" ", "");
		return texto;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		eliminarEspacios spc = new eliminarEspacios();
		String frase = in.nextLine();
		System.out.println(spc.eliminarEspacios(frase));
		
		/*
		  Además en lugar de crear un constructor y llamar el método eliminar
		  simplememte escribimos el método de eliminarEspacios y validar que este
		  metodo sea estatica
		  System.out.println(eliminarEspacios(frase));
		 */
		
		

	}

}
