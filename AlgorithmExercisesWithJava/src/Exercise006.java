import java.util.Scanner;

public class Exercise006 {
    public static void main(String[] args) {
        //006 - Crie um programa que leia um número e mostre seu dobro, triplo e raíz quadrada
        Scanner userInput = new Scanner(System.in);
        int userInputNumber;
        int doubleCalc;
        int tripleCalc;
        double squareRootCalc;

        //User Interaction
        System.out.println("\nCalculando Dobro, Triplo e Raíz Quadrada ... ...");
        System.out.println("\nEscreva um número qualquer: ");
        userInputNumber = userInput.nextInt();

        //Data Processing
        doubleCalc = userInputNumber * 2;
        tripleCalc = userInputNumber * 3;
        squareRootCalc = Math.sqrt(userInputNumber);

        //Ouputs
        System.out.printf("\nO dobro de %d, é %d\n", userInputNumber, doubleCalc);
        System.out.printf("O Triplo de %d, é: %d\n", userInputNumber, tripleCalc);
        System.out.printf("A raíz quadrada de %d, é: %.2f\n", userInputNumber, squareRootCalc);
        System.out.println();

        userInput.close();
    }
}
