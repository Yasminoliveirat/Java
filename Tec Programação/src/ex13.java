//Faça um programa na Linguagem Java que receba um número e mostre o resto da divisão por 6.

import java.util.Scanner;

public class ex13 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um valor: ");
        int n1 = sc.nextInt();

        int resto = n1 % 6;

        System.out.println("O resultado é: " + resto);

    }
}
