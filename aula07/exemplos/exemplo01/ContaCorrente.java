package exemplos.exemplo01;

public class ContaCorrente extends Conta{
    private final double TAXA_DEPOSITO = 0.1;
    
    public ContaCorrente(int numeroConta){
        super(numeroConta);
    }

    @Override
    public boolean deposito(double valor) {        
        if (valor >= 0) {   // depósito mais que zero?
            return super.deposito(valor - TAXA_DEPOSITO);            
        }
        return false;
    }

    @Override
    public boolean saque(double valor) {      
        if (getSaldoConta() >= valor) {  // tem saldo suficiente?
            return super.saque(valor);            
        }
        return false;
    }
    
}
