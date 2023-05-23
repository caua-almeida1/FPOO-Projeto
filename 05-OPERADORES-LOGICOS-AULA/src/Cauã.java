import java.util.Scanner;
	
public class Cauã {
	
	Scanner scanner = new Scanner(System.in);
	
	int a;
	int b;
	int c; 
	
	public void verificarMaior1() {
		
		System.out.println("INFORME O PONTO A");
		a = scanner.nextInt();
		
		System.out.println("INFORME O PONTO B");
		b = scanner.nextInt();
		
		System.out.println("INFORME O PONTO C");
		c = scanner.nextInt();
		
		if(a == b) {
			if(a == c) {
				System.out.println("OS PONTOS FORMAM UM TRIÂNGULO EQUILÁTERO");
			}
			}
		
		if(a == b) {
			if(a != c) {
				System.out.println("OS PONTOS FORMAM UM TRIÂNGULO ISÓSCELES");
			}
			}
		
		if(a != b) {
			if(a != c) {
				if(b != c) {
				System.out.println("OS PONTOS FORMAM UM TRIÂNGULO ESCALENO");
			}
			}
		}
		
		}
	}
//FIM DO MÉTODO verificarMaior1
	
	/*
	public void verificarMaior2() {
		
				if((n1 > n2) && (n1 > n3)) {
					System.out.println("N1 É O MAIOR VALOR");
					
					if((n2 > n1) && (n2 > n3)) {
						System.out.println("N2 É O MAIOR VALOR");
						
						if((n3 > n1) && (n3 > n2)) {
							System.out.println("N3 É O MAIOR VALOR");

		}
*/
	
	//FIM DA CLASSE MaiorValor

