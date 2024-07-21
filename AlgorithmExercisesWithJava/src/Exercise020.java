import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Exercise020 {
    public static void main(String[] args) {
        //020 - O mesmo professor do exercício anterior "019" quer sortear a ordem de apresentação de trabalhos dos alunos. Faça umprograma que leia o nome dos 4 alunos e mostre a ordem sorteada.
        Scanner userInput = new Scanner(System.in);
        String firstStudent;
        String secondStudent;
        String thirdStudent;
        String fourthStudent;
        List<String> studentList = new ArrayList<>();

        //User Input
        System.out.println("\nDigite o nome do 1º aluno: ");
        firstStudent = userInput.nextLine(); //NextLine Captura todo texto digitado na linha o que permite receber um texto longo (Ex. Nome completo)
        System.out.println("\nDigite o nome do 2º aluno: ");
        secondStudent = userInput.nextLine();
        System.out.println("\nDigite o nome do 3º aluno: ");
        thirdStudent = userInput.nextLine();
        System.out.println("\nDigite o nome do 4º aluno: ");
        fourthStudent = userInput.nextLine();

        //Data Processing
        //Criação de uma lista com alguns elementos
        studentList.add(firstStudent);
        studentList.add(secondStudent);
        studentList.add(thirdStudent);
        studentList.add(fourthStudent);

        Collections.shuffle(studentList); // Embaralha a lista para criar uma sequência aleatória

        //Output
        System.out.println("\nSequência aleatória: \n");
        for(String iterableVariable : studentList){
            System.out.println(iterableVariable);
        }
        System.out.println();

        //Printing 5 randomized sequence of this list
        System.out.println("\n\nAgora vamos Gerar e exibir 5 sequências aleatórias da lista criada\n");
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(studentList);
            System.out.println("Sequência aleatória " + (i + 1) + ": " + studentList);
            System.out.println();
        }

        userInput.close();
    }
}
