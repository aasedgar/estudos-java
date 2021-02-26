import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double custoFabrica, custosDist, impostos, custoTotal;
        
        System.out.println("Informe o custo de fábrica do carro:");
        custoFabrica = entrada.nextDouble();
        System.out.println("O custo de fábrica informado foi R$ " + custoFabrica);

        // System.out.println("A porcentagem do distribuidor é 28%");
        
        custosDist = custoFabrica * 0.28;
        impostos = custoFabrica * 0.45;
        System.out.println("A porcentagem dos impostos é 45%");
        
        custoTotal = custoFabrica + custosDist + impostos;
        System.out.println("O valor total do carro é R$ " + custoTotal);
        System.out.println("O total de impostos pagos é R$ " + impostos);
        
        entrada.close();
    }
}
