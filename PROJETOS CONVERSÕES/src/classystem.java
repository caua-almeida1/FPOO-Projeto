import java.util.Scanner;
public class classystem {
	
	public static void main (String[] args) {
		
		
			System.out.println("OP��ES");
			System.out.println("1- NOME DO SISTEMA OPERACIONAL ");
			System.out.println("2- ARQUITETURA DO SISTEMA OPERACIONAL ");
			System.out.println("3- VERS�O DO SISTEMA OPERACIONAL ");
			System.out.println("4- SEPARADOR DE ARQUIVO DO SISTEMA OPERACIONAL ");
			System.out.println("5- SEPARADOR DE LINHAS ");
			System.out.println("6- HOME DO USU�RIO ");
			System.out.println("7- HOME DO USU�RIO 2 ");
			
			System.out.println("DIGITE UM N�MERO: ");
			Scanner scanner = new Scanner(System.in);
			
			int opcao = scanner.nextInt();
			String monthString;
			switch (opcao) {
			
			
			case 1: monthString = "NOME DO SISTEMA O5PERACIONAL: " + System.getProperty("os.name");
			break;
			case 2: monthString = "ARQUITETURA DO SISTEMA OPERACIONAL: " + System.getProperty("os.arch");
			break;
			case 3: monthString = "VERS�O DO SISTEMA OPERACIONAL: " + System.getProperty("os.version");
			break;
			case 4: monthString = "SEPARADOR DE ARQUIVOS DO SISTEMA OPERACIONAL: " + System.getProperty("file.separator");
			break;
			case 5: monthString = "SEPARADOR DE LINHAS: " + System.getProperty("line.separator");
			break;
			case 6: monthString = "HOME DO USU�RIO: " + System.getProperty("user.home");
			break;
			case 7: monthString = "HOME DO USU�RIO: " + System.getProperty("user.dir");
			break;
			default: monthString = "C�digo Inv�lido";
			break;
			}
			System.out.println(monthString);

		
		
		
		
		
		
		
		
	}
	
	
}
