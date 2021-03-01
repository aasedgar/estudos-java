package exercicios.exercicio01;

public class Placar {
    private String time1, time2;
    private int golsTime1, golsTime2;

    public Placar() {     
        // this.time1 = "Time da Casa";
        // this.time2 = "Visitante";
        this("Time da Casa", "Visitante");  // 
    }
    
    public Placar(String time1, String time2) {
        // this.time1 = time1;
        // this.time2 = time2;
        this(time1, time2, 0, 2);   // chama o construtor de 4 parâmetros        
    }
    
    public Placar(String time1, String time2, int golsTime1, int golsTime2){
        this.time1 = time1;
        this.time2 = time2;        
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }
    @Override
    public String toString() {        
        return time1 + " " + golsTime1 + " x " + golsTime2 + " " + time2;
    }
}
