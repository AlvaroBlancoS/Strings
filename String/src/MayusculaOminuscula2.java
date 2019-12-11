import java.util.Scanner;

public class MayusculaOminuscula2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe la primera cadena: ");
		String cadena1 = in.nextLine();
		System.out.print("Escribe la segunda cadena: ");
		String cadena2 = in.nextLine();
		String[] cadenas = { cadena1, cadena2 };

		// Recorremos todas las cadenas
		for (String cadena : cadenas) {
			System.out.print(cadena + " :");
			// Con esta condicional averiguará si la cadena es mayuscula o minuscula
			if (cadena.equals(cadena1.toUpperCase()) && cadena.equals(cadena2.toUpperCase())) {
				System.out.println("Mayuscula");
			} else if (cadena.equals(cadena1.toLowerCase()) && cadena.equals(cadena2.toLowerCase())) {
				System.out.println("Minuscula");

			} else {
				System.out.println("Mixta");
			}
		}
	}
}
