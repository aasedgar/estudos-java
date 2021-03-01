package exercicios.exercicio03;

public class ContaPoupanca extends Conta {
    
    private static double taxaSaque;

    public ContaPoupanca(int numeroConta){
        super(numeroConta);
    }

    public static void setTaxaSaque(double taxa) {
        if (taxa > 0) {
            taxaSaque = taxa;            
        }
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldoConta() >= valor + taxaSaque) {  // tem saldo suficiente?            
            return super.saque(valor + taxaSaque);
        }
        return false;     
    }

}
