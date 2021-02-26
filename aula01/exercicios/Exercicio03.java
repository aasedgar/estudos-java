/*
Cálculo de 25% de aumento salarial
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, aumento25;

        System.out.println("Informe seu salário: ");
        salario = entrada.nextDouble(); // aqui é digitado o valor do salário
        System.out.println("Seu salário é R$ " + salario); // confirmação do valor digitado

        // cálculo de aumento salarial em 25% sobre o salário informado
        // aumento25 = salario * 0.25 + salario;
        aumento25 = salario * 1.25;
        System.out.println("Com aumento de 25%, seu novo salário será R$ " + aumento25);   // novo salário calculado

        entrada.close();
    }
}
