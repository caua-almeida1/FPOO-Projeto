package pacote;

import java.util.Scanner;

public class Exercicio1 {

public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		
		String planos;
		
		System.out.println("---BEM-VINDO AO SISTEMA DE PLANOS DE SAÚDE---");
		
		System.out.println("DIGITE O PLANO DESEJADO: ");
		
		planos = objScanner.next();
		
		if(planos.equalsIgnoreCase("Básico")){
			System.out.println("Valor do plano: R$:150,00");
		}
		
		else if(planos.equalsIgnoreCase("Bronze")) {
			System.out.println("Valor do plano: R$:220,00");
		}
		
		else if(planos.equalsIgnoreCase("Prata")) {
			System.out.println("Valor do plano: R$:310,00");
		}
		
		else if(planos.equalsIgnoreCase("Ouro")) {
			System.out.println("Valor do plano: R$:450,00");
		}
		
		else {
			System.out.println("PLANO NÃO ENCONTRADO :(");
		}
		
		
}
}