package exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n = 4.5167;
        int num = 7;
    
        System.out.printf("texto %.1f\n", n);
        
        System.out.printf("texto %.1f \n e o inteiro é %d", n, num);    
        
        teclado.close();
    }
}
