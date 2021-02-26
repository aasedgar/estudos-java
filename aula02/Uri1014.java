import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int km;
        double combustivel, consumo;

        km = teclado.nextInt();
        combustivel = teclado.nextDouble();

        consumo = km / combustivel;

        System.out.printf("%.3f km/l\n", consumo);

        teclado.close();
    }
}
