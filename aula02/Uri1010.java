import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        Ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
        o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        Após, calcule e mostre o valor a ser pago.
        */

        int qtdePeca1, qtdePeca2;
        double valorPeca1, valorPeca2, total;

        teclado.nextInt();
        qtdePeca1 = teclado.nextInt();
        valorPeca1 = teclado.nextDouble();
        
        teclado.nextInt();
        qtdePeca2 = teclado.nextInt();
        valorPeca2 = teclado.nextDouble();

        total = qtdePeca1 * valorPeca1 + qtdePeca2 * valorPeca2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        teclado.close();
    }
}
