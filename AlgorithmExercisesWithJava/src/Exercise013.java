import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise013 {
    public static void main(String[] args) {
        /*
         * 013 - Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.
         */
        Scanner userInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,000.00 Kz");
        double salary;
        double salaryIncremeent;
        double newSalary;

        //User Input
        System.out.println("\nInforme seu salário actual: ");
        salary = userInput.nextDouble();

        //Data Processing
        salaryIncremeent = (salary * 15) / 100;
        newSalary = salary + salaryIncremeent;

        //Output
        System.out.println("\nCom o aumento de 15% seu novo salário é de: " + df.format(newSalary));

        System.out.println();
        userInput.close();
    }
}
