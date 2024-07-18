import java.util.Scanner;

public class Exercise016 {
    public static void main(String[] args) {
        //016 - Crie um programa que leia um número real qualquer no teclado e mostre sua portção inteira.
        Scanner userInput = new Scanner(System.in);
        double floatingPointNumber;
        int integerPartOfNumber;

        //User Input
        System.out.println("\nEscreva um número eral qualquer usando vírgula para separar a parte decimal: ");
        floatingPointNumber = userInput.nextFloat();

        //Data Processing
        integerPartOfNumber = (int) floatingPointNumber;

        //output
        System.out.println("\nA parte inteira do número digitado é: " + integerPartOfNumber);

        userInput.close();
    }
}
