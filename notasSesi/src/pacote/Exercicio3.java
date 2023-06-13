package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String codigo;
		
		double salario = 0, total = 0, x, y;
		
		codigo = JOptionPane.showInputDialog("Digite o código do cargo escolhido");
		
		salario = Double.parseDouble(JOptionPane.showInputDialog(Digite o salario));
		
		switch (codigo) {
		case "1":
			
			y = salario;
			x = y / 100;
			total = salario + (x * 50);
			
			JOptionPane.showMessageDialog(null, "O salário antigo é: " + salario);
			JOptionPane.showMessageDialog(null, "O novo salário é: " + total + "houve um aumento de 50%");
			
		break;
		
		case "2":
			
			y = salario;
			x = y / 100;
			total = salario + (x * 35);
			
			JOptionPane.showMessageDialog(null, "O salário antigo é: " + salario);
			JOptionPane.showMessageDialog(null, "O novo salário é: " + total + "houve um aumento de 35%");
			
		break;
		
		case "3":
			
			y = salario;
			x = y / 100;
			total = salario + (x * 20);
			
			JOptionPane.showMessageDialog(null, "O salário antigo é: " + salario);
			JOptionPane.showMessageDialog(null, "O novo salário é: " + total + "houve um aumento de 20%");
			
		break;
		
		case "4":
			
			y = salario;
			x = y / 100;
			total = salario + (x * 10);
			
			JOptionPane.showMessageDialog(null, "O salário antigo é: " + salario);
			JOptionPane.showMessageDialog(null, "O novo salário é: " + total + "houve um aumento de 10%");
			
		break;
		
		case "5":
			
			y = salario;
			x = y / 100;
			total = salario + (x * 0);
			
			JOptionPane.showMessageDialog(null, "O salário antigo é: " + salario);
			JOptionPane.showMessageDialog(null, "O novo salário é: " + total + "Não houve aumento");
			
		break;
		}
		
		

	}

}
