package exercicios;

// Escreva um método em java que retorne o menor entre 3 números inteiros fornecidos como parâmetro

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1, numero2, numero3;
        /*
        for (int i = 0; i < 3; i++) {
            System.out.printf("Informe o %dº número\n", i);
            numero = teclado.nextInt();
        }
        */
        System.out.println("Informe um número:");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();
        numero3 = teclado.nextInt();


        System.out.println("O menor número dentre os três digitados é " + menorNumero(numero1, numero2, numero3));

        teclado.close();
    }

    static int menorNumero(int valor1, int valor2, int valor3) {

        if (valor1 <= valor2 && valor1 <= valor3) {
            return valor1;
        } else {
            if (valor2 <= valor1 && valor2 <= valor3) {
                return valor2;
            } else {
                return valor3;
            }
        }

    }


}
