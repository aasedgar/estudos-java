import java.util.Scanner;

/**
 * TesteEx02
 */
public class TesteEx02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, mediaFinal;

        System.out.println("Qual a sua primeira nota?");
        numero1 = entrada.nextDouble();
        System.out.println("Sua primeira nota foi ");

        System.out.println("Qual a sua segunda nota?");
        numero2 = entrada.nextDouble();
        System.out.println("Sua segunda nota foi ");

        mediaFinal = (numero1 + numero2) / 2;
        System.out.println("Sua média final é " + mediaFinal);

        entrada.close();
    }
}