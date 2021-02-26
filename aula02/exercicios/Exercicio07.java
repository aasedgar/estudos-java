package exercicios;

/*
Validando um triângulo
*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c;        
        boolean naoTriangulo, equilatero, isosceles;

        System.out.println("informe o lado A:");
        a = teclado.nextDouble();
        
        System.out.println("informe o lado B:");
        b = teclado.nextDouble();
        
        System.out.println("informe o lado C:");
        c = teclado.nextDouble();
        
        naoTriangulo = (a > b + c) || (b > a + c) || (c > a + b);   // qualquer lado é maior que a soma dos outros dois
        equilatero = (a == b) && (b == c);  // todos os lados são iguais
        isosceles = (a == b) || (b == c) || (a == c);  // apenas dois lados são iguais
        // else = escaleno

        if (naoTriangulo) {
            System.out.println("Não forma um triângulo");
        } else {
            if (equilatero) {
                System.out.println("Triângulo equilátero");
            } else {
                if (isosceles) {
                    System.out.println("Triângulo isósceles");
                } else{
                    System.out.println("Triângulo escaleno");
                }
            }
        }

        teclado.close();
    }
}
