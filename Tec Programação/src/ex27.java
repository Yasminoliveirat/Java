/*O cardápio de uma lanchonete é o seguinte:

                    Código             Preço

Cachorro quente       100              1,20
Bauru simples         101              1,30
Bauru com ovo         102              1,50
Hambúrger             103              1,20
Cheeseburguer         104              1,30
Refrigerante          105              1,00

Faça um programa na Linguagem Java que leia o código do item pedido, a quantidade e calcule o 
valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item.
 */


import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o código do pedido: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int qtd = sc.nextInt();

        double total = 0.0;

        if (codigo == 100) {
            total = qtd * 1.20;
        } else if (codigo == 101) {
            total = qtd * 1.30;
        } else if (codigo == 102) {
            total = qtd * 1.50;
        } else if (codigo == 103) {
            total = qtd * 1.20;
        } else if (codigo == 104) {
            total = qtd * 1.30;
        } else {
            total = qtd * 1.00;
        }

        System.out.println("Valor total: " + total);
    }
}
