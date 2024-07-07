import java.util.Scanner;

public class Exercise005 {
    public static void main(String[] args) {
        //005 - Faça um programa que leia um número inteiro e mostre na tela o seu antecessor e sucessor.
        Scanner userInput = new Scanner(System.in);
        int integerNumber;
        int antecessor;
        int sucessor;


        //User interaction
        System.out.println("\nSiga as instruções abaixo para calcular o antecessor e sucessor de um número inteiro: ");
        System.out.println("\nEscreva um número inteiro: ");
        integerNumber = userInput.nextInt();

        //Data Processing
        antecessor = integerNumber - 1;
        sucessor = integerNumber + 1;

        //Outputs
        System.out.printf("\nO antecessor de %d, é: %d\n", integerNumber, antecessor);
        System.out.printf("O sucessor de %d, é: %d\n", integerNumber, sucessor);
        System.out.println();

        userInput.close();
    }
}
