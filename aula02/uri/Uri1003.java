package uri;

import java.util.Scanner;

/**
 * Uri1003
 */
public class Uri1003 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Entrada

        int a, b, soma;

        a = teclado.nextInt();
        b = teclado.nextInt();

        // 2. Processamento

        soma = a + b;

        // 3. Saída

        System.out.println("SOMA = " + soma);

        teclado.close();
    }
}