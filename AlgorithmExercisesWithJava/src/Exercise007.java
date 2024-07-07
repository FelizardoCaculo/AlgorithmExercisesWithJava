import java.util.Scanner;

public class Exercise007 {
    public static void main(String[] args) {
        //007 - Desenvolva um programa que leia 2 notas de um aluno, calcule e mostre a média.
        Scanner userInput = new Scanner(System.in);
        double studantFirstGrade;
        double studantSecondGrade;
        double studantAvarage;

        //User interaction
        System.out.println("\nPreencha as informações abaixo para calcular a média de um aluno ... ...\n");
        System.out.print("1ª Nota: ");
        studantFirstGrade = userInput.nextDouble();
        System.out.print("\n2ª Nota: ");
        studantSecondGrade = userInput.nextDouble();

        //Data Processing
        studantAvarage = (studantFirstGrade + studantSecondGrade) / 2;

        //Output
        System.out.println("\nA média do Aluno é: " + studantAvarage);
        System.out.println();

        userInput.close();
    }
}
