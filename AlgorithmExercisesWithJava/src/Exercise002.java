import java.util.Scanner;

public class Exercise002 {
    public static void main(String[] args) {
        //002 - Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas na tela.

        Scanner userInput = new Scanner(System.in);
        String userName;

        System.out.println("\nEscreva seu 1º nome: ");
        userName = userInput.next();
        System.out.println("\nOlá " + userName + ", seja bem vindo ao mundo da programação\n");
        
        userInput.close();    
    }
}
