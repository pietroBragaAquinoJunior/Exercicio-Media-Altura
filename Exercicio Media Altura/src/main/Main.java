package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* O programa lê alturas e calcula a média. */
		/* Exercício em Java para treinamento de FOR e Vetores. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular a média de quantas alturas?");
		int nAlturas = sc.nextInt();
		
		double[] vetor = new double[nAlturas]; 
		
		System.out.printf("Digite as %d alturas: %n", nAlturas);
		for(int i=0;i<nAlturas;i++) {
			double valorAltura = sc.nextDouble();
			vetor[i] = valorAltura; 
		}
		
		double soma = 0;
		
		for(int i=0;i<nAlturas;i++) {
			soma += vetor[i];
		}
		
		System.out.printf("Média: %.2f", soma/nAlturas);
		sc.close();
		
	}

}
