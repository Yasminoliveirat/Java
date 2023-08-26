/*Faça um programa na Linguagem  Java  que efetue a leitura de um número inteiro e apresentar 
uma mensagem informando se o número é par ou ímpar. */

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é ímpar");
        }
    }
}
