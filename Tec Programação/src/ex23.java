/*Faça um programa na Linguagem  Java  que efetue a leitura de cinco números inteiros e 
identificar o maior e o menor valor. Não execute a ordenação de valores. */

import java.util.Scanner;

public class ex23 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, numero3, numero4, numero5;

        System.out.print("Digite o 1º número: ");
        numero1 = sc.nextInt();

        System.out.print("Digite o 2º número: ");
        numero2 = sc.nextInt();

        System.out.print("Digite o 3º número: ");
        numero3 = sc.nextInt();

        System.out.print("Digite o 4º número: ");
        numero4 = sc.nextInt();

        System.out.print("Digite o 5º número: ");
        numero5 = sc.nextInt();

        int maior = numero1;
        int menor = numero1;

        if (numero2 > maior) {
            maior = numero2;
        } else if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        } else if (numero3 < menor) {
            menor = numero3;
        }

        if (numero4 > maior) {
            maior = numero4;
        } else if (numero4 < menor) {
            menor = numero4;
        }

        if (numero5 > maior) {
            maior = numero5;
        } else if (numero5 < menor) {
            menor = numero5;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
