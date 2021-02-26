package exercicios.exercicio05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook (String titulo, String autor, int totalPaginas, int paginaAtual){
        
    }

    public void mostrarCapa(){
        System.out.printf("%s \n %s \n %d\n", titulo, autor, totalPaginas);
    }

    public int exibirPagina(int paginaAtual){        
        return paginaAtual;

    }

    public void avancarPagina(){
        paginaAtual++;
    }

    public void retrocederPagina(){
        paginaAtual--;
    }

    public void irParaPagina(){
        if (paginaAtual >= 0 && paginaAtual <= totalPaginas);
        } else {
            System.out.println("Página não encontrada");
        }

    }

}
