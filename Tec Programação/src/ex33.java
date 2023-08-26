/*Faça um programa na Linguagem  Java  para apresentar o total da soma obtida dos cem 
primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100). */

public class ex33 {
    public static void main(String[] args) {
        int total = 0;
        int i = 1;

        while (i <= 100) {
            total += i;
            i++;
        }

        System.out.println("A soma dos cem primeiros números é: " + total);
    }
}
