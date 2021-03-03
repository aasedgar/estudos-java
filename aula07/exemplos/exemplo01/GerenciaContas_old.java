package exemplos.exemplo01;

// arquivo antigo utilizado para estudar

import java.util.ArrayList;

public class GerenciaContas_old {
    private ArrayList<Conta> listaDeContas;

    public GerenciaContas_old() {
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
    /*  ContaCorrente cc = null;
        cc = new ContaCorrente(numeroConta);
        listaDeContas.add(cc); */
        listaDeContas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
    /*  ContaEspecial ce = null;
        ce = new ContaEspecial(numeroConta, limite);
        listaDeContas.add(ce); */
        listaDeContas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.add(new ContaPoupanca(numeroConta));
    }

    public boolean deposito(int numeroConta, double valor) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta.deposito(valor);                
            }
        }
        return false;   // false não achou a conta
    }

    public boolean saque(int numeroConta, double valor) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta.saque(valor);                
            }
        }
        return false;   // false não achou a conta
    }

    public String exibirSaldo(int numeroConta) {
        for (Conta conta : listaDeContas) { // para cada "ContaCorrente" da "listaDeContas"
             if (conta.getNumeroConta() == numeroConta) {
              return conta.toString();  // mesma coisa de return conta + ""; - para que interprete que o objeto precisa virar String antes de retornar
            }
        }
        return "Conta não encontrada";
    }

}
