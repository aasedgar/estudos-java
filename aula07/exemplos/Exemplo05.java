package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        try {
        System.out.println("Digite um número inteiro");
        // numero = teclado.nextInt();
        numero = Integer.parseInt(teclado.nextLine());
        System.out.println("Você digitou o número: " + numero);
        
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Você não digitou um número inteiro");
        } catch (NumberFormatException ex) {
            System.out.println("Número inválido");
        } catch (Exception ex) {
            System.out.println("Erro" + ex.getMessage());
            ex.printStackTrace();
        } finally {            
            System.out.println("Fechando as conexões");
            teclado.close();

        }
        System.out.println("Tchau...");
        
    }
}
