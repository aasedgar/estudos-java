package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Informe um número:");
        numero = teclado.nextInt();


        if (valida(numero) == true) {
            System.out.println("O número é par");            
        } else {
            System.out.println("O número é impar");            
        }
        teclado.close();
    }

    static boolean valida(int valor) {
                
        if (valor % 2 == 0) {
            return true;
        }
        return false;

    }


}
