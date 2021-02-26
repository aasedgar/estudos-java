package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtdeAluno, qtdeTurma;
        double mediaAluno, mediaTurma, mediaGeral;
        
        mediaTurma = 0;
        mediaGeral = 0;

        do {
            System.out.println("Aluno, informe sua média:");
            mediaAluno = teclado.nextDouble();
            mediaTurma = mediaTurma + mediaAluno;
            qtdeAluno++;

        } while (qtdeAluno <= 2);
            mediaAluno = 0;
            while (condition) {
                
            }
            System.out.println("Aluno, informe sua média:");

        teclado.close();
    }
}
