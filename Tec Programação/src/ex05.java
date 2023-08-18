import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        int f= sc.nextInt();

        int c = (f - 32) * 5/9;

        System.out.println("Temperatura em graus Celsius: " + c);

    }
    
}
