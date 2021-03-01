package exemplos.exemplo02;

public abstract class Pessoa {  // classe abstrata
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

   /* public abstract void telefonar(){   // método abstrato
            
    } */

}
