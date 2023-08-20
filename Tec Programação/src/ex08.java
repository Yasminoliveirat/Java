//Faça um programa na Linguagem Java que calcule a área da circunferência.

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da circunferência: ");
        double raio = sc.nextDouble();

        double area = calcularArea(raio);

        System.out.println("A área da circunferência é:  " + area);

    }

    public static double calcularArea(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
}
