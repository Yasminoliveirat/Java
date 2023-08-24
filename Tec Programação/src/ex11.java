/*Faça um programa na Linguagem Java  para ler dois valores inteiros para as variáveis A e B 
e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável 
B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
*/

import java.util.Scanner;

public class ex11 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um valor para variavel A: ");
        int a = sc.nextInt();

        System.out.print("Digite outro valor para a variavel B: ");
        int b = sc.nextInt();

        int c= a;
        a = b;
        b = c;

        System.out.println("Varialvel A = " + a + " e variavel B = " + b);
    }

}
