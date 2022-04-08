package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a senha de acesso: ");

		int key = sc.nextInt();

		while (key != 2002) {
			System.out.println("Acesso negado");
			System.out.print("Insira a senha de acesso: ");
			key = sc.nextInt();
		}
		System.out.println("Acesso Autorizado");

		sc.close();

	}

}
