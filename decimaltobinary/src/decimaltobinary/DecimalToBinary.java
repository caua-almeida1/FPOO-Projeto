package decimaltobinary;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		int number,i=0;
		int binary[] =new int[100];
		Scanner user_input=new Scanner(System.in);
		System.out.println("ESCREVA O N�MERO EM DECIMAL: ") ;
		number=user_input.nextInt();
		
		while (number!=0)
		{	
			binary[i] =number%2;
			number=number/2;
			i++;
			
		}
		
		System.out.println("ESTE N�MERO EM BIN�RIO �: ");
		for (int j=i-1;j>=0;j--)
		{
			System.out.print(""+binary[j]);
		}
	}
}	
