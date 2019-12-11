import java.util.Scanner;

public class MayusculaOminuscula {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cadena = in.nextLine();
		boolean mayuscula = cadena.equals(cadena.toUpperCase());
		boolean minuscula = cadena.equals(cadena.toLowerCase());
		if (mayuscula) {
			System.out.println("Es mayuscula");
		} else if (minuscula) {
			System.out.println("Es minuscula");
		} else {
			System.out.println("Mixta");
		}
	}

}
