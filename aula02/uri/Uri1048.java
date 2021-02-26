package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario, reajuste15, reajuste12, reajuste10, reajuste07, reajuste04;

        salario = teclado.nextDouble();

        reajuste15 = salario * 1.15;
        reajuste12 = salario * 1.12;
        reajuste10 = salario * 1.10;
        reajuste07 = salario * 1.07;
        reajuste04 = salario * 1.04;

        if (salario <= 400) {
            System.out.printf("Novo salario: %.2f\n Reajuste ganho: %.2f\n Em percentual: 15 %\n", reajuste15, salario*0.15);
        } else {
            if (salario <= 800) {
                System.out.printf("Novo salario: %.2f\n Reajuste ganho: %.2f\n Em percentual: 12 %\n", reajuste12, salario*0.12);
            } else {
                if (salario <= 1200) {
                    System.out.printf("Novo salario: %.2f\n Reajuste ganho: %.2f\n Em percentual: 10 %\n", reajuste10, salario*0.10);                    
                } else {
                    if (salario <= 2000) {
                        System.out.printf("Novo salario: %.2f\n Reajuste ganho: %.2f\n Em percentual: 7 %\n", reajuste07, salario*0.07);
                    } else {
                        System.out.printf("Novo salario: %.2f\n Reajuste ganho: %.2f\n Em percentual: 4 %\n", reajuste04, salario*0.04);
                    }

                }
            }
        } 
        
        teclado.close();
    }
}
