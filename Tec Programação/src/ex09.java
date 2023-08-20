/*Faça um programa na Linguagem Java para efetuar o cálculo e a apresentação do valor
 de uma prestação em atraso, utilizando a fórmula:
 PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).
*/

import java.util.Scanner;

public class ex09 {
     public static void main (String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Digite o valor da prestação: ");
        double valor = sc.nextDouble();

        System.out.print("Digite o tempo de atraso em meses: ");
        int tempo = sc.nextInt();

        System.out.print("Digite a taxa de juros : ");
        double taxa = sc.nextDouble();

        double prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.println("O valor da prestação em atraso é: " + prestacao);

     }
}
