package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Armando", 5000);
        Gerente g = new Gerente("Ricardo", 5000, 10);
        
        f.aumentarSalario(10);
        g.aumentarSalario(10);
    
        f.setNome("Armando");
    // System.out.println("Funcionário: " + f.exibir());
        System.out.println("Funcionário: " + f);

        g.setNome("Ricardo");
        //  System.out.println("Gerente: " + g.exibir());
        //  System.out.println("gerência: " + g.getNumeroFuncionarios());
        System.out.println("Gerente: " + g);  
        
    }
}
