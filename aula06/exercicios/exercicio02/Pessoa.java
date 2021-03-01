package exercicios.exercicio02;

public class Pessoa {
    private String nome, telefone;

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;        
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {        
        return nome + ", " + telefone;
    }

}
