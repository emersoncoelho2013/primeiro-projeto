package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// SOMA +
		int numero1 = 20;
		int numero2 = 10;
		int resultado = numero1 + numero2;
		System.out.println(resultado);
		
		//SUBTRA��O
		
		float n1 = (float) 20.40;
		float n2 = (float) 0.40;
		System.out.println(n1 - n2);
		
		//MULTIPLICA��O
		
		int num1 = 2;
		int num2 = 6;
		System.out.println("MULTIPLICA��O: " + ( num1 * num2));
		
		//DIVIS�O
		
		System.out.println("DIVIS�O: (/)" + 10/2);
		
		//RESTO DA DIVIS�O %
		System.out.println("RESTO DA DIVIS�O: " + num2%num1);
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numeroUsuario = teclado.nextInt();
		System.out.println("Digite um numero: ");
		int numeroUsuario2 = teclado.nextInt();
		System.out.println("numero * 2 = " + numeroUsuario*numeroUsuario2);
		teclado.close();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
