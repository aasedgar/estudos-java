package exemplos.exemplo02;

public class App {
    public static void main(String[] args) {
    //  Pessoa p = new Pessoa("Edgar", "(11) 98888-7777");
        Estudante e = new Estudante("Silvia", "(11) 91111-2222", "Enfermagem");
        Professor prof = new Professor("Noel", "(11) 93333-4444", 6000);

    //  System.out.println(p);
        System.out.println(e);
        System.out.println(prof);
    }
}
