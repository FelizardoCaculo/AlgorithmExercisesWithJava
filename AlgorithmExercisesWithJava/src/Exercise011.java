import java.util.Scanner;

public class Exercise011 {
    public static void main(String[] args) {
        /*
         * 011 - Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a quantidade de tinta necessária para pintá-la, sabendo que cada litro de tinta, pinta uma área de 2 metros quadrado.
         */
        Scanner userInput = new Scanner(System.in);
        double widthOfTheWall;
        double heightOfTheWall;
        double areaOfTheWall;
        double quantityOfPaint;

        //User Inputs
        System.out.println("Preencha as informasões solicitadas a seguir ... ...");
        System.out.println("OBS: Use vírgula como separador de casas decimais ... ...");
        System.out.println("\nLargura da parede: ");
        widthOfTheWall = userInput.nextDouble();
        System.out.println("\nAltura da parede: ");
        heightOfTheWall = userInput.nextDouble();

        //Data Processing
        areaOfTheWall = heightOfTheWall * widthOfTheWall;
        quantityOfPaint = areaOfTheWall / 2;

        //Outputs
        System.out.printf("\nA parede tem uma área de %.2f metros\n", areaOfTheWall);
        System.out.printf("Precisamos %.2f litros de tinta para pintar toda parede\n\n", quantityOfPaint);

        userInput.close();
    }
}
