import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise018 {
    public static void main(String[] args) {
        //018 - Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.
        Scanner userInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double angle;
        double angleSine;
        double angleCosine;
        double angleTangent;

        //User Input
        System.out.println("\nPreencha os dados solicitados abaixo usando vírgula (,) para separar valores decimais ... ...\n");
        System.out.println("\nEscreva o valor do ângulo: ");
        angle = userInput.nextDouble();

        //Data Processing
        angleSine = Math.sin(Math.toRadians(angle));
        angleCosine = Math.cos(Math.toRadians(angle));
        angleTangent = Math.tan(Math.toRadians(angle));

        //Output
        System.out.println("\nO ângulo de  " + angle + "º tem o Seno de: " + df.format(angleSine));
        System.out.println("\nO ângulo de  " + angle + "º tem o Cosseno de: " + df.format(angleCosine));
        System.out.println("\nO ângulo de  " + angle + "º tem a tangente de: " + df.format(angleTangent));
        System.out.println();

        userInput.close();
    }
}
