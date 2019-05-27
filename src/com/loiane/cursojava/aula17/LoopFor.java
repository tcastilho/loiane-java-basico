package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		for (int i = 5; i > 0; i--) {
			System.out.println("i tem valor: " + i);
		}
		
		for (int i = 0, j = 10; i < j; i++) {
			System.out.println("i = " + i + " j = " + j);
		}
		
		int count = 0;
		for ( ; count < 10; ) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		
		for (int counter = 0; counter < 10; counter += 2) {
			System.out.println("Valor de counter: " + counter);
		}
		
		int sum = 0;
		for (int i = 1; i < 5; sum += i++)
			System.out.println("O valor da soma: " + sum);
		
	}

}
