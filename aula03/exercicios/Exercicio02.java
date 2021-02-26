package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont, tabuada;
        
        cont = 1;

        System.out.println("Digite o numero desejado:");
        
        tabuada = teclado.nextInt();

        while (cont < 11) {
            // System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
            System.out.printf("%d x %2d = %2d\n", tabuada, cont, (tabuada*cont));
            cont++;
        }
    teclado.close();
    }
}
