package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// SOMA +
		int numero1 = 20;
		int numero2 = 10;
		int resultado = numero1 + numero2;
		System.out.println(resultado);
		
		//SUBTRAÇÃO
		
		float n1 = (float) 20.40;
		float n2 = (float) 0.40;
		System.out.println(n1 - n2);
		
		//MULTIPLICAÇÃO
		
		int num1 = 2;
		int num2 = 6;
		System.out.println("MULTIPLICAÇÃO: " + ( num1 * num2));
		
		//DIVISÃO
		
		System.out.println("DIVISÃO: (/)" + 10/2);
		
		//RESTO DA DIVISÃO %
		System.out.println("RESTO DA DIVISÂO: " + num2%num1);
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numeroUsuario = teclado.nextInt();
		System.out.println("Digite um numero: ");
		int numeroUsuario2 = teclado.nextInt();
		System.out.println("numero * 2 = " + numeroUsuario*numeroUsuario2);
		teclado.close();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
