package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, media, pares, impares;

        numero = 0;
        media = 0;
        pares = 0;
        impares = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println("Digite o " + i + "º número");
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                media = media + numero;
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Quantidade total de números: " + numero);
        System.out.println("A média dos valores pares é: " + (media / pares));
        System.out.println("A porcentagem total de números ímpares é: " + ((double) impares * 100) / numero + " %" ) ;

        teclado.close();
    }
}
