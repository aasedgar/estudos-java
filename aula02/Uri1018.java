import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor;
        boolean cedula;

        valor = teclado.nextInt();

        cedula = (0 < valor) && (0 < 1000000);
        
        System.out.println(valor);
        
        // int n = 13;
        // System.out.println(n / 2);
        
        System.out.println(valor % 2);  // % - resto da divisão

        teclado.close();
    }
}
