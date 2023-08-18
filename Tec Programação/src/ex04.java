// Faça um programa na Linguagem Java que leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        int c= sc.nextInt();

        int f =  (9 * c + 160) /5;

        System.out.println("Temperatura em Fahrenheit: " + f);

    }
}
