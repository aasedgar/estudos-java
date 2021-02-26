package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, pares, impares;

        pares = 0;
        impares = 0;

        for (int i = 1; i < 11 ; i++) { // também poderia ser decrescente for (int i = 10; i < 0 ; i--) {
            System.out.println("Digite o " + i + "º número:");
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de impares é: " + impares);
        teclado.close();
    }
}
