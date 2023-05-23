import java.util.Scanner;

public class Enunciado04 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n1, resto;
		
		System.out.println("INFORME UM NÚMERO:");
		n1 = scanner.nextInt();
		
		if(n1 > 0){
			resto = n1 % 2;
		if(resto == 0) {
			System.out.println("O NÚMERO INFORMADO É PAR");
		}else {
			
		}
			if(resto > 0) {
				System.out.println("NÚMERO INFORMADO É IMPAR");
			
		}else {
			if(n1 <0) {
				System.out.println("NÚMERO INVÁLIDO");
			}
		}
}
}
}
			

