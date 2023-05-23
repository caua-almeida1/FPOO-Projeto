
import java.util.Scanner;

public class Enunciado02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("INFORME O PRIMEIRO NÚMERO:");
		n1 = scanner.nextInt();
		System.out.println("INFORME O SEGUNDO NÚMERO:");
		n2 = scanner.nextInt();
		System.out.println("INFORME O TERCEIRO NÚMERO:");
		n3 = scanner.nextInt();
		
		//System.out.println("INFORME O PRIMEIRO NÚMERO:");
		
		if(n1 > n2){
			if(n1 > n3) {
				System.out.println("O N1 É O MAIOR NÚMERO: " + n1);	
			}
		}else {
			if(n2 > n1){
				if(n2 >n3) {
					System.out.println("O N2 É O MAIOR NÚMERO: " + n2);
				}
			}
		}
			
		if(n3 >n1){
			
			if(n3 >n2) {
			System.out.println("O N3 É O MAIOR NÚMERO: " + n3);
	

			}
		}
	}

}








