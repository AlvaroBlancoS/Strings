package Practicas;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String eMail;
		do {
			System.out.print("Introduzca email: ");
			eMail = in.nextLine();
		} while (!Pattern.matches(regex, eMail));
		System.out.println(eMail);
	}

}
