package exemplos.exemplo01;

public class ContaEspecial extends Conta{

    private double limite;

    public ContaEspecial(int numeroConta, double limite){
        super(numeroConta);
        this.limite = limite;
    }

    @Override
    public String toString() {        
        return "Nº da conta: " + getNumeroConta() + "\nSaldo da conta: R$ " + getSaldoConta() + "\nLimite: R$ " + limite;
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldoConta() + limite >= valor) {
            return super.saque(valor);
        }
        return false;
    }    
}
