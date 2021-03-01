package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numeroFuncionarios;

    public Gerente(String nome, double salario, int numeroFuncionarios) {
        super(nome, salario);   // chamada ao construtor da classe base (superClasse)
        this.numeroFuncionarios = numeroFuncionarios;
    }
    public void setNumeroFuncionarios (int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    @Override   // anotação - indica sobreposição do método
    public String toString() {
        return super.toString() + " : " + numeroFuncionarios;    

    }

    // sobrescrever aumenta salário em 10 % a mais

    @Override
    public void aumentarSalario(double porcentagem) {
        super.aumentarSalario(porcentagem + 10);        
    }    
}
