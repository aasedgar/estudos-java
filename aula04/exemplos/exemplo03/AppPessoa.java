package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
     // Pessoa p = new Pessoa();    // instanciando (criando) um objeto do tipo Pessoa
     // Pessoa p2 = new Pessoa();
     
        Pessoa p = new Pessoa("Edgar", 4000);    // instanciando (criando) um objeto do tipo Pessoa
        Pessoa p2 = new Pessoa("Lary", 5000);

     // p.nome = "Edgar";
     // p.salario = 4000;
        p.apresentar();

     // p2.nome = "Lary";
     // p2.salario = 5000;
        p2.apresentar();
    }
}
