import java.util.Scanner;

public class Exercise009 {
    public static void main(String[] args) {
        //009 - Faça um programa que leia um número inteiro qualquer e mostre na tela sua tabuada.
        Scanner userInput = new Scanner(System.in);
        int numberOfMutiplicationTable;

        System.out.println("\nEscreva um número inteiro para calcular a tabuada: ");
        numberOfMutiplicationTable = userInput.nextInt();
        
        //Data Processing
        System.out.println("== Tabuada == \n");
        for(int iterableVariable = 1; iterableVariable <= 12; iterableVariable++){
            System.out.printf("%d X %d = %d\n", iterableVariable, numberOfMutiplicationTable, numberOfMutiplicationTable * iterableVariable);
        }
        System.out.println("\n== Tabuada == \n");

        userInput.close();
    }
}
