import java.util.Scanner;

public class Exercise003 {
    public static void main(String[] args) {
        //003 - Crie uma programa que leia dois números e mostre a soma entre eles.
        Scanner userInput = new Scanner(System.in);
        int firstNumber;
        int SecondNumber;
        int resultOfSum;

        //Interacting with the user/getting inputs
        System.out.println("\nPara somar dois número do tipo inteiro siga os passoas abaixo ... ...");
        System.out.println("\nEscreva o 1º Número: ");
        firstNumber = userInput.nextInt();
        System.out.println("\nEscreva o 2º Número: ");
        SecondNumber = userInput.nextInt();

        //Processing outputs
        resultOfSum = firstNumber + SecondNumber;
        System.out.println("\nProcessando dados ... ... ...\n");
        System.out.println(firstNumber + " + " + SecondNumber + " = " + resultOfSum);

        userInput.close();
    }
}
