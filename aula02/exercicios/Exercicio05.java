package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String senha;   // quando se compara texto, usa-se string

        System.out.println("Digite a senha:");
        senha = teclado.nextLine();

        if (senha.equals("R10p5") == true) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        teclado.close();
    }
}
