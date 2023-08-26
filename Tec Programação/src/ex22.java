//Faça um programa na Linguagem  Java  que leia 3 números inteiros e mostre o maior deles.

import java.util.Scanner;

public class ex22 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("O maior número é " + n1);
        } else if (n2 > n1 && n2 > n3){
            System.out.println("O maior número é " + n2);
        } else{
            System.out.println("O maior núemro é " + n3);
        }
    }
}
