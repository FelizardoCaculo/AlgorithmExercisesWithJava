import java.util.Scanner;

public class Exercise012 {
    public static void main(String[] args) {
        //012 - Faça umprograma que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
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
        System.out.printf("\nO novo preço é: %.2f \n\n", newProductPrice);
        
        userInput.close();
    }
}
