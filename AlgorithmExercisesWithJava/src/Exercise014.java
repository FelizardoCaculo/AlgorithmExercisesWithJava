import java.util.Scanner;

public class Exercise014 {
    public static void main(String[] args) {
        //014 - Escreva um programa que converta uma temperatura digitada em graus Celcios para graus Fahrenheit.
        Scanner userInput = new Scanner(System.in);
        float temperatureInCelsius;
        float temperatureInFahrenheit;

        //User Input
        System.out.println("\nEscreva a temperatura em graus Celcios utilizando (,) para separar casas decimais: ");
        temperatureInCelsius = userInput.nextFloat();

        //Data Processing
        temperatureInFahrenheit = (float) (temperatureInCelsius * 1.8) + 32;

        //Output
        System.out.printf("\n%.2fº Célcios é equivalente a %.2fº Fahrenheit\n", temperatureInCelsius, temperatureInFahrenheit);
        userInput.close();
    }
}