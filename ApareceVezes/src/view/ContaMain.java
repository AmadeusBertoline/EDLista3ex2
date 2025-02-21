package view;

import controller.ContaController;
import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args1) {

		ContaController conta = new ContaController();
		Scanner scanner = new Scanner(System.in);

		int res, maior, menor, opc = 0;

		System.out.println("Digite um número de 10 a 999999: \n ");
		maior = scanner.nextInt();

		while (opc != 9) {

			if (maior < 10 || maior > 999999) {

				while (maior < 10 || maior > 999999) {
					System.out.println("Digite um número entre: 10 e 999999 apenas \n ");
					maior = scanner.nextInt();
				}

			} else if (maior >= 10 && maior <= 999999) {

				System.out.println("Digite um número de 0 a 9: \n ");
				menor = scanner.nextInt();

				if (menor < 0 || menor > 9) {

					while (menor < 0 || menor > 9) {
						System.out.println("Digite um número de 0 a 9 apenas: \n ");
						menor = scanner.nextInt();
					}

				} else if (menor >= 0 && menor <= 9) {

					res = conta.ContaVezes(maior, menor);

					System.out.println("O número " + menor + " aparece " + res + " vezes em  " + maior);

					opc = 9;

					System.out.println("Fim do programa");

					scanner.close();

				}

			}

		}

	}
}
