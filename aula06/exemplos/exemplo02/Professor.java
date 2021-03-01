package exemplos.exemplo02;

public class Professor extends Pessoa {
    private double salario;

    public Professor (String nome, String telefone, double salario){
        super(nome, telefone);
        this.salario = salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    @Override
    public String toString() {        
        return super.toString() + ", salário: " + salario;
    }

  /*  public void telefonar(){

    } */
}
