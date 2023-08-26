/* Faça um programa na Linguagem Java que leia 3 (três) valores inteiros e apresente os 
  3 números em ordem crescente.
 */

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();
        
        if (n1 <= n2 && n1 <= n3) {
            System.out.print(n1 + ", ");
            if (n2 <= n3) {
                System.out.print(n2 + ", " + n3);
            } else {
                System.out.print(n3 + ", " + n2);
            }
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.print(n2 + ", ");
            if (n1 <= n3) {
                System.out.print(n1 + ", " + n3);
            } else {
                System.out.print(n3 + ", " + n1);
            }
        } else {
            System.out.print(n3 + ", ");
            if (n1 <= n2) {
                System.out.print(n1 + ", " + n2);
            } else {
                System.out.print(n2 + ", " + n1);
            }
        }
        
        
    }
}

