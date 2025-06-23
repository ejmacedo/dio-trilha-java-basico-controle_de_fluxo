package entities;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int numberOne = sc.nextInt();

		System.out.println("Digite o segundo número:");
		int numberTwo = sc.nextInt();

		try {
			contar(numberOne, numberTwo);
		} catch (RuntimeException e) {
			if (numberOne > numberTwo) {
				System.out.println(e.getMessage()); 
			}
		}

		System.out.println();

	}

	public static void contar(int numberOne, int numberTwo) throws ParametrosInvalidosException {

		int contador = 0;
		int contagem = numberTwo - numberOne;
		
		for (int i = 0; i < contagem; i++) {
			if (numberOne > numberTwo) {
				throw new ParametrosInvalidosException("O número 1 tem que ser menor que o numero 2!");
			}

			System.out.println("Imprimindo número " + numberOne);
			
			numberOne ++;
			contador ++;
			
		}
		System.out.println("O número de iterações foi: " + contador);
		
	}

}
