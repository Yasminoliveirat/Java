import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        
        double resultado = n1 * n2;
        
        System.out.println("O resultado da multiplicação é: " + resultado);
        
        scanner.close();
    }
}
