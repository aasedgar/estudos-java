package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c, d;
        boolean aceito;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        d = teclado.nextDouble();

        /*
        se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B
        e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos"
        */
        
        aceito = (b > c) && (d > a) && (c + d > a + b) && (c >= 0) && (d >= 0) && (a % 2 == 0);

        if (aceito) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        teclado.close();
    }
}
