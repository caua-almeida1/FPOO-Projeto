package pacote;

import javax.swing.JOptionPane;

public class Notas2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1;
		
		double nota2;
		
		double nota3;
		
		double nota4;
		
		double media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota: "));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota: "));
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
	if (media > 7) {
		
		System.out.println("SUA M�DIA �: " + media + " (APROVADO)");
		
		}
	
	else if (media >= 5 && media <= 7) {
	
		System.out.println("SUA M�DIA �: " + media + " (RECUPERA��O)");
	
	}
	
	else {
		System.out.println("SUA M�DIA �: " + media + "(REPROVADO)");
	}
}
}
