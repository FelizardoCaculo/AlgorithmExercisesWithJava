import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise012 {
    public static void main(String[] args) {
        //012 - Faça umprograma que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
        DecimalFormat df = new DecimalFormat("#,000.00 kz"); //Formatting local Angola currency
        Scanner userInput = new Scanner(System.in);
        double productPrice;
        int discountPercentage = 5;
        double newProductPrice;
        double discountValue;

        //User Input
        System.out.println("\nCalculando desconto de 5% no preço de um produto ... ...");
        System.out.println("\nPreço do produto: ");
        productPrice = userInput.nextDouble();

        //Data Processing
        discountValue = (productPrice * discountPercentage) / 100;
        newProductPrice = productPrice - discountValue;

        //Output
        System.out.println("\nO novo preço é: " + df.format(newProductPrice));
        //System.out.println();
        userInput.close();
    }
}
