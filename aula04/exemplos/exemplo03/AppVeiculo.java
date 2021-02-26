package exemplos.exemplo03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Civic", "Honda", 11);

        veiculo1.apresentar();
                
        System.out.printf("Consumo %.2f km/l\n", veiculo1.obterConsumo());
    }
}
