package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c, media;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        a = a * 2;
        b = b * 3;
        c = c * 5;

        media = (a + b + c) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        teclado.close();
    }
}
