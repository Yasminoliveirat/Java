//Faça um programa na Linguagem Java que que receba um número e mostre o fatorial desse número.

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O resultado é: " + fatorial);
    }
}
