package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario;

        System.out.println("Informe seu salário atual:");
        salario = teclado.nextDouble();
        System.out.println("O salário informado foi R$ " + salario);

        if (salario <= 600.0) {
            System.out.println("Desconto INSS: Isento");
        } else {
            if (salario <= 1200.0) {
                System.out.println("Desconto INSS: 20%");

            } else {
                if (salario <= 2000.0) {
                System.out.println("Desconto INSS: 25%");

                } else {
                System.out.println("Desconto INSS: 30%");
                 }
                }
            }
        teclado.close();
        }
}
