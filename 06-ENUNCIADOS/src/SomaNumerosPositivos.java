import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, soma = 0;

        do {
            System.out.println("DIGITE UM NÚMERO POSITIVO (OU UM NÚMERO NEGATIVO PARA SAIR): ");
            numero = input.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A SOMA DOS NÚMEROS POSITIVOS DIGITADOS É: " + soma);
	}
}