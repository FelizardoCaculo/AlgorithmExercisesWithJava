import java.util.Scanner;

public class Exercise004 {
    public static void main(String[] args) {
        //004 - Faça um programa que leia uma palavra pelo teclado e manipule o testo usando os metodos para Strings
        Scanner userInput = new Scanner(System.in);
        String userInputText;

        System.out.println("\nEscreva uma palavra qualquer: ");
        userInputText = userInput.next();
        System.out.println("Processando o texto recebido ... ... ...");
        System.out.println("\nA palavra que você escreveu é: " + userInputText);
        System.out.println("\nMaiúscula: " + userInputText.toUpperCase());
        System.out.println("Minúscula: " + userInputText.toLowerCase());
        System.out.println("Primeira Letra: " + userInputText.charAt(0));
        System.out.println("Última Letra: " + userInputText.charAt(userInputText.length() - 1));
        System.out.println("A palavra tem " + userInputText.length() + " letras");

        System.out.println("\n");
        userInput.close();

    }
}
