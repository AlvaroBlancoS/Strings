package Practicas;

import java.util.Scanner;

public class Usuario {
/*
 * Permite convalidar los códigos
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		//Con el método toLowerCase nos permitirá que convertirá todas en minusculas 
		//mientras escribimos en mayusculas o minusculas.
		String input = sc.next().toLowerCase();
		
		
		//Pero sin embargo el método IgnoreCase ignorará si es mnayuscula o minuscula
		if (input.equalsIgnoreCase("admin")) {
			System.out.println("Username accepted");
		}else {
			System.out.println("Invalid username");
		}
		
	}

}
