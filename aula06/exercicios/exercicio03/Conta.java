package exercicios.exercicio03;

public abstract class Conta {
    private int numeroConta;
    private double saldoConta;

    public Conta(int numeroConta){
        this.numeroConta = numeroConta;
     }
    
    public boolean deposito(double valor){
        if (valor > 0 ) {
            saldoConta += valor; // abreviação de saldo = saldo + valor
            return true;
        }
        return false;
    }

    public boolean saque(double valor){
        if (valor > 0) {
            saldoConta -= valor; // abreviação de saldo = saldo - valor
            return true;
        }
        return false;
    }

    public double getSaldoConta(){
        return saldoConta;
    }

    public double getNumeroConta(){
        return numeroConta;
    }

    @Override
    public String toString() {        
        return "Nº da conta: " + numeroConta + "\nSaldo da conta: R$ " + saldoConta;
    }

}
