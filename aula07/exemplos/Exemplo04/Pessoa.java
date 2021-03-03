package exemplos.Exemplo04;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
        endereco = new Endereco("", 0);
    }
    
    public String toString() {
        return nome + " endereço: " + endereco.toString();
    }

}
