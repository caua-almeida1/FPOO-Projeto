package pacote;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		String produtos;
		double valor=0, quantidade;
		
		System.out.println("---BEM-VINDO AO SISTEMA DE PRODUTOS---");
		
		System.out.println("DIGITE O CÓDIGO DO PRODUTO DESEJADO: ");
		
		produtos = objScanner.next();
		
		if(produtos.equalsIgnoreCase("A001")){
			System.out.println("Valor do produto: R$ 7,50");
			System.out.println("Digite a quantidade de produtos: ");
			quantidade = objScanner.nextDouble();
			
			valor = quantidade * 7.50;
			
			System.out.println("O PREÇO TOTAL DOS PRODUTOS É: R$:" + valor);
		}
		
		else if(produtos.equalsIgnoreCase("A002")) {
			System.out.println("Valor do produto: R$ 9,90");
			System.out.println("Digite a quantidade de produtos: ");
			quantidade = objScanner.nextDouble();
			
			valor = quantidade * 9.90;
			
			System.out.println("O PREÇO TOTAL DOS PRODUTOS É: R$:" + valor);
		}
		
		else if(produtos.equalsIgnoreCase("A003")) {
			System.out.println("Valor do produto: R$ 14,00");
			System.out.println("Digite a quantidade de produtos: ");
			quantidade = objScanner.nextDouble();
			
			valor = quantidade * 14.00;
			
			System.out.println("O PREÇO TOTAL DOS PRODUTOS É: R$:" + valor);
		}
		
		else if(produtos.equalsIgnoreCase("A004")) {
			System.out.println("Valor do produto: R$ 19,99");
			System.out.println("Digite a quantidade de produtos: ");
			quantidade = objScanner.nextDouble();
			
			valor = quantidade * 19.99;
			
			System.out.println("O PREÇO TOTAL DOS PRODUTOS É: R$:" + valor);
		}
		
		else {
			System.out.println("PRODUTO NÃO ENCONTRADO :(");
		}
		
		

	}

}
