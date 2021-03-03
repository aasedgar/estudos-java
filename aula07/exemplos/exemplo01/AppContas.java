package exemplos.exemplo01;

import java.util.ArrayList;
import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite, valor;        
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ArrayList<Conta> listaDeContas = new ArrayList<>();
        
        do {            
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Fazer depósito");
            System.out.println("5-Fazer saque");
            System.out.println("6-Verificar saldo");
            System.out.println("7-Sair");
            System.out.println("==> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    listaDeContas.add(cc);
                    break;

                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite da conta:");
                    limite = teclado.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);
                    listaDeContas.add(ce);
                    break;            

                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    listaDeContas.add(new ContaPoupanca(numeroConta));
                    break;            
                
                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();

                    for (Conta conta : listaDeContas) {
                        if (conta.getNumeroConta() == numeroConta) {
                            System.out.println("Valor do depósito:");
                            valor = teclado.nextDouble();

                            if (conta.deposito(valor)){
                                System.out.println("Depósito realizado");
                            } else {
                                System.out.println("Falha na operação");
                            }                           
                            break;
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();

                    for (Conta conta : listaDeContas) {
                        if (conta.getNumeroConta() == numeroConta) {
                            System.out.println("Valor para saque:");
                            valor = teclado.nextDouble();
                            
                            if (conta.saque(valor)) {
                                System.out.println("Saque realizado");
                            } else {
                                System.out.println("Falha na operação");
                            }
                            break;
                        }
                    }

                    break;            

                case 6:
                    System.out.println("Informe o número  da conta:");
                    numeroConta = teclado.nextInt();

                    for (Conta conta : listaDeContas) { // para cada "ContaCorrente" da "listaDeContas"
                        if (conta.getNumeroConta() == numeroConta) {
                            System.out.println(conta);
                        }
                    }
                    // System.out.println(listaDeContas);                    
                    break;
                    
                case 7:
                    
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 7);            

     teclado.close();
    }
}
