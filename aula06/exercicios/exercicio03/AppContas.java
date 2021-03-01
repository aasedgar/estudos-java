package exercicios.exercicio03;

// import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        // Conta conta = new Conta(1298);
        // ContaCorrente cc = new ContaCorrente(2673);
        // ContaEspecial ce = new ContaEspecial(7832, 200);
        ContaPoupanca cp = new ContaPoupanca(4444);
        ContaPoupanca.setTaxaSaque(0.15);
        
        if (cp.deposito(100)) {
            System.out.println("Depósito realizado");
        } else {
            System.out.println("Falha na operação");
        }
        
        if (cp.saque(99)) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
        
        System.out.println(cp);
                
        // System.out.println("Taxa adicionada ao saque: R$ ");
        
        /* 
        Scanner teclado = new Scanner(System.in);
        double deposito, saque;
        
        System.out.println(conta);

        System.out.println("Informe o valor a ser depositado:");
        deposito = teclado.nextDouble();
        System.out.println("Valor informado para depósito: R$ " + deposito);

        System.out.println("Informe o valor de saque desejado:");
        saque = teclado.nextDouble();
        System.out.println("Valor informado para saque: R$ " + saque);

        teclado.close();
        */

    }
}
