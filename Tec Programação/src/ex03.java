//Faça um programa na Linguagem Java que receba 2 números e apresente a multiplicação dos dois números.
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1= sc.nextInt();

        System.out.print("Digite outro valor: ");
        int n2= sc.nextInt();

        int mult = n1 * n2;
        
        System.out.println("Resultado: " + mult);

    }
}