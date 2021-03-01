package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario  = salario;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    @Override   // anotação - indica sobreposição do método
    public String toString() {
        return nome + ": " + salario;
    }

    // aumentar salario do funcionário em x %
    public void aumentarSalario(double porcentagem) {
        salario = salario + salario * porcentagem / 100;
    }
}
