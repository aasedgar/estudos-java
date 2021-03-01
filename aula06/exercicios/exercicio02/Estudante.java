package exercicios.exercicio02;

public class Estudante extends Pessoa{
    String curso;


    public Estudante(String nome, String telefone, String curso) {
        super(nome, telefone);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {        
        return super.toString() + ", curso: " + curso;
    }
}
