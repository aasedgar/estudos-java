package exemplos.exemplo03;

public class Veiculo {
    // atributos
    String modelo, marca;
    double consumo;
    
    // método construtor
    // Veiculo(String modelo, String marca, double consumo){
        // this.modelo = modelo - this. se refere ao próprio objeto Atributo (da classe), não o Parâmetro (do método) 
        // this.marca = marca
        // this.consumo = consumo
    
    Veiculo(String model, String brand, double cons){
        modelo = model;
        marca = brand;
        consumo = cons;
    }
    void apresentar(){  //método sem retorno (para o Main), precisa imprimir dentro dele (localmente)
        System.out.printf("Modelo %s\n Marca %s\n", modelo, marca);
    }
    double obterConsumo(){  // método com retorno (para o Main), imprime (sysout) no Main
        return consumo;
    }
}
