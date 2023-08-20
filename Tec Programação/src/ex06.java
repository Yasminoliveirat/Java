// Faça um programa na Linguagem Java  para calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA.
//TERMINAR

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do óleo: ");
        double raio = sc.nextDouble();

        System.out.println("Digite a altura do óleo: ");
        double altura = sc.nextDouble();

        double volume = 3.14159 * raio **2 * altura;

        System.out.println("O volume do óleo é: " + volume);
    }
}
