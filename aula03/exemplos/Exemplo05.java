package exemplos;

import java.util.Scanner;

// USANDO DO WHILE

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
/*
        System.out.println("Digite um valor inteiro menor que 10:");
        numero = teclado.nextInt();
*/
        // numero = 20;

        do {
            System.out.println("Digite um valor inteiro menor que 10:");
            numero = teclado.nextInt();            
        } while (numero >= 10);
        teclado.close();
    }
}
