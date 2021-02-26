package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Informe a primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Primera nota foi: " + nota1);

        System.out.println("Informe a segunda nota:");
        nota2 = teclado.nextDouble();
        System.out.println("Primera nota foi: " + nota2);

        media = (nota1 * 0.40 + nota2 * 0.60) / 1;

        System.out.printf("Sua média é %.2f\n", media);

        if(media >= 6){
            System.out.printf("Parabéns, você está aprovado");
        } else {
            System.out.printf("Infelizmente, você está reprovado");
        }

        teclado.close();

    }
}
