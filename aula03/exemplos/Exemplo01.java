package exemplos;

/**
 * Exemplo01
 * 
 * Estrutura de Repetição com WHILE
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont = 1;   // inicialização

        while (cont <= 10) {    // condição = valor final
            System.out.println(cont);
            // cont++; // cont = cont + 1; abreviado
            cont += 2; // cont = cont + 2; abreviado
            // pode ser += -= *= /=
        }
        System.out.println("Valor final: " + cont);
    }
}