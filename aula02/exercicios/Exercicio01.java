package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor;

        valor = teclado.nextInt();

        if (valor > 20) {
                        
            System.out.println("Metade = " + valor / 2.0);
        }

        teclado.close();
    }
}
