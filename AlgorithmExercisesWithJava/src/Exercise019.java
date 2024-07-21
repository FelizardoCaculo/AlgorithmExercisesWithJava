import java.util.Scanner;

public class Exercise019 {
    public static void main(String[] args) {
        //019 - Um professor quer sortear um dos seu 4 alunos para apagar o quadro. Faça um programa que ajude ele, lendo o nome dos alunos e escrevendo na tela o nome do escolhido.
        Scanner userInput = new Scanner(System.in);
        String firstStudent;
        String secondStudent;
        String thirdStudent;
        String fourthStudent;
        String chousenStudent;
        int chousenIndex;
        
    
        //UserInput
        System.out.println("\nDigite o nome do 1º aluno: ");
        firstStudent = userInput.nextLine(); //NextLine Captura todo texto digitado na linha o que permite receber um texto longo (Ex. Nome completo)
        System.out.println("\nDigite o nome do 2º aluno: ");
        secondStudent = userInput.nextLine();
        System.out.println("\nDigite o nome do 3º aluno: ");
        thirdStudent = userInput.nextLine();
        System.out.println("\nDigite o nome do 4º aluno: ");
        fourthStudent = userInput.nextLine();

        //Data Processing
        String [] studantList = {firstStudent, secondStudent, thirdStudent, fourthStudent};
        chousenIndex  = (int) (Math.random() * studantList.length); //Gera um índece aleatório entre 0 e 3
        chousenStudent = studantList[chousenIndex];

        //Output
        System.out.println("\nO aluno escolhido é: " + chousenStudent);
        System.out.println();
        

        userInput.close();
    }
}
