/*Faça um programa na Linguagem  Java  que leia quatros valores referentes a quatro notas 
escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor 
da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem 
informando esta condição. Apresentar junto das mensagens o valor da média do aluno para 
qualquer condição.
 */

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        double n4 = sc.nextDouble();
        
        double media = (n1 + n2 + n3 + n4) / 4;
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
        
    }
}
