import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double salarioMinimo, kwConsumido, precoKw, fatura, desc15;

        System.out.println("Qual o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Salário mínimo informado foi R$ " + salarioMinimo);

        System.out.println("Quantos quilowatts de energia foram consumidos?");
        kwConsumido = entrada.nextDouble();
        System.out.println("Quilowatts informado foram " + kwConsumido);
        
        precoKw = salarioMinimo / 500;
        System.out.println("Cada quilowatt custa R$ " + precoKw);

        fatura = kwConsumido * precoKw;
        System.out.println("Valor total da fatura: R$ " + fatura);

        desc15 = fatura * 0.85;
        System.out.println("Fatura com desconto de 15%: R$ " + desc15);

        entrada.close();
    }
}
