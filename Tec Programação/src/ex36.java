/*Faça um programa na Linguagem  Java  que apresente os valores de conversão de graus Celsius 
em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 
100 graus Celsius. O programa deve apresentar os valores das duas temperaturas. */

public class ex36 {
    public static void main(String[] args) {
        System.out.println("Graus Celsius  |  Graus Fahrenheit");
        System.out.println("----------------------------------");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%7d°C       |  %8.2f°F%n", celsius, fahrenheit);
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
