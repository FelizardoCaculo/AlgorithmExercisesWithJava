import java.util.Scanner;

public class Exercise008 {
    public static void main(String[] args) {
        //008 - Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
        Scanner userInput = new Scanner(System.in);
        double valueInMeters;
        double centimeterConvertedValue;
        double milimeterConvertedValue;
        double kilometerConvertedValue;

        //User Interaction
        System.out.println("\n====== Conversor de Medidas ======\n");
        System.out.println("Escreva um valo em metros: ");
        valueInMeters = userInput.nextDouble();

        //Data Processing
        centimeterConvertedValue = valueInMeters * 100;
        milimeterConvertedValue = valueInMeters * 1000;
        kilometerConvertedValue = valueInMeters / 1000;

        //Outputs
        System.out.printf("\n%.2f metros é equivalente a %.2f kilometros\n", valueInMeters, kilometerConvertedValue);
        System.out.printf("%.2f metros é equivalente a %.2f Centímetros\n", valueInMeters, centimeterConvertedValue);
        System.out.printf("%.2f metros é equivalente a %.2f Milímetros\n", valueInMeters, milimeterConvertedValue);
        System.out.println();

        userInput.close();
    }
}
