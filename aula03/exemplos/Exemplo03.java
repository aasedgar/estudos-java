package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor;
        char resposta;

        resposta = 's';

        while (resposta == 's' || resposta == 'S') {
            System.out.println("Digite um número:");
            valor = Integer.parseInt(teclado.nextLine());   // transforma texto (valor nexlinue) em número (integer)

            System.out.println("Valor lido: " + valor);

            System.out.println("Deseja continuar (S/N)?");
            resposta = teclado.nextLine().charAt(0);
        }
        teclado.close();
    }
}
