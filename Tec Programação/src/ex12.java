//Faça um programa na Linguagem Java para efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número.

import java.util.Scanner;

public class ex12 {

    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um valor: ");
        int n1 = sc.nextInt();

        int resultado = n1 * n1;

        System.out.println("O resultado é: " + resultado);

    }
}
