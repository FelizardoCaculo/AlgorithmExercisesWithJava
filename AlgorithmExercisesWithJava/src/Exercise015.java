import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise015 {
    public static void main(String[] args) {
        //015 - Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro custa AKZ 6.000,00 por dia e AKZ 20,00 por cada Km rodado.
        Scanner userInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,000.00 kz");
        double kilometersTraveled;
        int rentalDays;
        double priceToPay;
        double dailyRate = 6000;
        double ratePerKilometer = 20;

        //User Input
        System.out.println("\n==== Preencha as informações abaixo para calcular o preço a pagar ====\n");
        System.out.println("\nQuantidade de Kilómetros percorridos: ");
        kilometersTraveled = userInput.nextDouble();
        System.out.println("\nDias de Aluguel: ");
        rentalDays = userInput.nextInt();

        //Data Processing
        priceToPay = (rentalDays * dailyRate) + (kilometersTraveled * ratePerKilometer);

        //Output
        System.out.println("\n================================================");
        System.out.println("O valor a pagar pelo alugel é: " + df.format(priceToPay));
        System.out.println("================================================");

        userInput.close();
    }
}