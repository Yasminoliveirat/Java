//Faça um programa na Linguagem Java que leia a idade de uma pessoa expressa em ano, mês e dia e mostre-as em dias.


import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite quantos anos você tem: ");
        int anos = sc.nextInt();

        System.out.print("Digite quantos meses você tem: ");
        int meses = sc.nextInt();

        System.out.print("Digite quantos dias você tem: ");
        int dias = sc.nextInt();

        int resultado = anos * 365 + meses * 30 + dias;
        System.out.println("A idade total em dias é: " + resultado);

    }
}
