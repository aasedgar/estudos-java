package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Lulu"," Doberman ",2020);
        Animal animal2 = new Animal("Lulu"," Doberman ",2020,"Carlos"," (11) 98888-7777");

        Proprietario proprietario = new Proprietario("Carlos"," (11) 98888-7777");
        Animal animal3 = new Animal("Lulu"," Doberman ", 2020, proprietario);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}