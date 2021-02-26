package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, cont;

        cont = 1;
        
        System.out.println("Informe um número:");
        numero = teclado.nextInt();        
        
        while (cont <= numero) {
            System.out.printf(cont + ", ");                     
            cont *= 2;
        }
    teclado.close();
    }
}
