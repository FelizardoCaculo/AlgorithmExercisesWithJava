import java.util.Scanner;

public class Exercise010 {
    public static void main(String[] args) {
        //010 - Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ele pode comprar.
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
        System.out.printf("\nVoce pode comprar $%.2f Dólares\n\n", destinyCoinValue);

        System.out.println();
        userInput.close();
    }
}
