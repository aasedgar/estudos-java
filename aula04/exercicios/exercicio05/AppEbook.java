package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook livro = new Ebook("Nome do Livro", "Nome do Autor", 300, 20);
    
        livro.mostrarCapa();

        System.out.println("Página atual " + livro.exibirPagina(5));

        livro.avancarPagina();

        livro.retrocederPagina();

        livro.irParaPagina();        
    
    }


}
