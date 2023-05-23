import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, soma = 0;

        do {
            System.out.print("Digite um n�mero positivo (ou um n�mero negativo para sair): ");
            numero = input.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A soma dos n�meros positivos digitados �: " + soma);
    }
}