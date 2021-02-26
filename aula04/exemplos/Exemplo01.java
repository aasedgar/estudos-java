package exemplos;

/**
 * Exemplo01
 * 
 * Métodos, blocos com void (nada, não tem)
 */
public class Exemplo01 {

    public static void main(String[] args) {
        System.out.println("Programa de cadastro v. 1.1.2");
        linha2(30);    // chamada de método. todo método tem () na frente
        System.out.println("Bom dia!");
        linha();

        linha2(15);
        linha2(25);

        int comprimento = 35;
        linha2(comprimento);

        linha3(20, '*');    // apóstrofe
        linha3(15, '#');

    }

    // fixo
    static void linha() {   // void = nada, não tem (retorno, resposta)
        System.out.println("--------");
    }

    // tamanho muda de acordo com a variável
    static void linha2(int tamanho) {
        for(int i = 0; i < tamanho; i++) {
        System.out.print("-");
        }
        System.out.println();
    }

    // tamanho e caractér mudam com as variáveis
    static void linha3(int tamanho, char tipo) {    // char é apenas 1 caractér, usa apóstrofre = 'a'
        for(int i = 0; i < tamanho; i++) {
        System.out.print(tipo);
        }
        System.out.println();
    }

}