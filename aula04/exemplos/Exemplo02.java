package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int resultado;
        
        resultado = soma(12, 5);

        System.out.println("A soma é " + resultado);

    }

    static int soma(int valor1, int valor2) { // para variáveis declaradas dentro do método, o tipo deve ser declarada para cada uma = int a, int b, etc
        int resposta;

        resposta = valor1 + valor2;

        return resposta; // return = palavra reservada, TERMINA A EXECUÇÃO E RETORNA O VALOR. Obrigatório para métodos que não sejam void

        // return aceita if abaixo

    }
}
