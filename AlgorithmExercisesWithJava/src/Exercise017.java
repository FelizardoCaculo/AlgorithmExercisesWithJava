import java.util.Scanner;

public class Exercise017 {
    public static void main(String[] args) {
        //017 - Faça um programa que leia o cumprimento do cateto oposto e do cateto adjacente de um triângulo. Calcule e mostre o cumprimento da hipotenusa.
        Scanner userInput = new Scanner(System.in);
        double lengthOfOppositeSide;
        double lengthOfAdjacentSide;
        double lengthOfHypotenuse;

        //User Input
        System.out.println("\nPreencha os campos abaixo para calcular o cumprimento da hipotenusa usando (,) vírgula para separar a parte decimal ...");
        System.out.println("\nCumprimento do Cateto Oposto: ");
        lengthOfOppositeSide = userInput.nextDouble();
        System.out.println("\nCumprimento do cateto Adjacente: ");
        lengthOfAdjacentSide = userInput.nextDouble();

        //Data Processing
        lengthOfHypotenuse = Math.sqrt(Math.pow(lengthOfOppositeSide, 2) + Math.pow(lengthOfAdjacentSide, 2));

        //Output
        System.out.println("\nO cumprimento da hipotenusa é: " + lengthOfHypotenuse);

        userInput.close();
    }
}
