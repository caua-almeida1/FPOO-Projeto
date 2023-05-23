
import java.util.Scanner;

public class Enunciado03 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

double nota1, nota2, nota3, nota4, nota5, media, media1 = 0;
				
				System.out.println("INFORME A NOTA 1: ");
				nota1 = scanner.nextDouble();
				
				System.out.println("INFORME A NOTA 2: ");
				nota2 = scanner.nextDouble();
				
				System.out.println("INFORME A NOTA 3: ");
				nota3 = scanner.nextDouble();
				
				System.out.println("INFORME A NOTA 4: ");
				nota4 = scanner.nextDouble();
			
				
		media = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println("SUA NOTA: " + media);
		
		if(media >= 7 ) {
			System.out.println("VOCÊ FOI APROVADO!!!");
			System.exit(0);
		}else{
			System.out.println("VOCÊ FOI REPROVADO :(");
			System.out.println("INFORME A SUA NOTA DE RECUPERAÇÃO: ");
			nota5 = scanner.nextDouble();
			media1 = (nota1 + nota2+ nota3+ nota4 + nota5) / 5;
			System.out.println("SUA NOTA: " + media1);
		}
		
		{
		if(media1 >= 7 ) {
			System.out.println("VOCÊ FOI APROVADO!!!");
		}else{
			System.out.println("VOCÊ FOI REPROVADO :(");
	}
}
}
}

