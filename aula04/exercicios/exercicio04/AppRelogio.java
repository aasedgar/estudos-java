package exercicios.exercicio04;

import java.util.Scanner;

/*

*/

public class AppRelogio {
    public static void main(String[] args) {
        Relogio watch;
        Scanner teclado = new Scanner(System.in);
        
        int horaTest, minutoTest, segundoTest;
        
        System.out.println("Informe a hora:");
        horaTest = teclado.nextInt();
        
        System.out.println("Informe os minutos:");
        minutoTest = teclado.nextInt();
        
        System.out.println("Informe os segundos:");
        segundoTest = teclado.nextInt();
        
        watch = new Relogio(horaTest, minutoTest, segundoTest);
        watch.exibir();

        teclado.close();
    }
}
