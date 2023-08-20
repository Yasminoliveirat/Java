/*Faça um programa na Linguagem Java que efetue a apresentação do valor da conversão em 
real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e 
também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor 
em moeda brasileira.
*/

import java.util.Scanner;

public class ex10 {
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Quantos dólares você tem: ");
        double dolar = sc.nextDouble();

        System.out.print("Qual o valor da cotação do dólar: ");
        double cotacao = sc.nextDouble();

        double reais = dolar * cotacao;

        System.out.println("Você tem " + reais +" reais");
    }
}
