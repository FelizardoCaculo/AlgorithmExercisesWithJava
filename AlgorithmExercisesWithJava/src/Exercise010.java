import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise010 {
    public static void main(String[] args) {
        //010 - Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ele pode comprar.
        DecimalFormat df = new DecimalFormat("$ #,000.00"); //Formatting local Angola currency
        Scanner userInput = new Scanner(System.in);
        double originCoinValue;
        double exchangeRate;
        double destinyCoinValue;

        //User Interaction
        System.out.println("Conversor de Moeda AKZ/USD");
        System.out.println("\nValor AKZ: ");
        originCoinValue = userInput.nextDouble();
        System.out.println("OBS: deve usar vírgula para separar as casas decimais.");
        System.out.println("Taxa de câmbio: ");
        exchangeRate = userInput.nextDouble();

        //Data Processing
        destinyCoinValue = originCoinValue / exchangeRate;

        //Output
        System.out.println("\nVoce pode comprar " + df.format(destinyCoinValue));

        System.out.println();
        userInput.close();
    }
}
