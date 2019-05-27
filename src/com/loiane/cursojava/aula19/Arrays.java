package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		double[] temps = new double[365];
		temps[0] = 31.3;
		temps[1] = 32;
		temps[2] = 33.7;
		temps[3] = 34;
		temps[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 eh: " + temps[0]);
		
		System.out.println("O tamanho do array: " + temps.length);
		
		System.out.println("Valores do array: ");
		
		for (int i = 0; i < temps.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1) + " eh: " + temps[i]);
		}
		
		for (double temp : temps) {
			System.out.println(temp);
		}

	}

}
