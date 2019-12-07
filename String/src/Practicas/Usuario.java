package Practicas;

import java.util.Scanner;

public class Usuario {
/*
 * Permite convalidar los códigos
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String input = sc.next().toLowerCase();
		
//		input.equalsIgnoreCase("admin")
		if (input.equalsIgnoreCase("admin")) {
			System.out.println("Username accepted");
		}else {
			System.out.println("Invalid username");
		}
		
	}

}
