package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario, prestacao, emprestimo;

        System.out.println("Informe seu salario bruto atual:");
        salario = teclado.nextDouble();
        System.out.println("Salario informado: R$ " + salario);

        System.out.println("Informe o valor da prestação:");
        prestacao = teclado.nextDouble();
        System.out.println("Salario informado: R$ " + prestacao);

        emprestimo = salario * 0.30;
        
        System.out.println("Valor máximo permitido para prestação: R$ " + emprestimo);

        if (prestacao <= emprestimo) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo recusado");
        }

        teclado.close();
    }
}
