import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Informe sua primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Sua primeira nota foi " + nota1);

        System.out.println("Informe sua segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Sua segunda nota foi " + nota2);

        media = (nota1 + nota2) / 2;
        System.out.println("Sua média é: " + media);

        entrada.close();
    }
}
