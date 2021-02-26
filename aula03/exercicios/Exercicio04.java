package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, cont, soma;

        cont = 1;
        soma = 0;

        System.out.printf("Digite o %dº número\n", cont);
        numero = teclado.nextInt();
        soma = soma + numero;
            
        //cont = 2;
        while (numero != 0) {
            cont++;
            System.out.printf("Digite o %dº número\n", cont);
            numero = teclado.nextInt();
            soma = soma + numero;
            // cont++;
            
        }        
        System.out.println("A soma dos valores é: " + soma);
        teclado.close();
    }
}
