package br.com.soma;

import java.util.*;

class SomaDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		// Declaração das Variáveis
		int num1, num2, soma;
		
		// Leituras
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		num2 = sc.nextInt();

		// Soma
		soma = num1 + num2;

		//Mostrar na tela
		System.out.println("Soma: " + soma);
	}
}
