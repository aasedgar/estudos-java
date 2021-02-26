package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio (int hora, int minuto, int segundo) {                
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void exibir(){
        System.out.printf("Hora atual: %02d h %02d m %02d n\n", hora, minuto, segundo);
    }

    public void setHora(int hora){
        if (hora >= 0 && hora <= 23){
            this.hora = hora;
        } else {
            System.out.println("As horas precisam ser entre 0 e 23");
        }
    }
    public void setMinuto(int minuto){
        if (minuto >= 0 && minuto <= 59){
            this.minuto = minuto;
        } else {
            System.out.println("Os minutos precisam ser entre 0 e 59");
        }
    }
    public void setSegundo(int segundo){
        if (segundo >= 0 && segundo <=59){
            this.segundo = segundo;
        } else {
            System.out.println("Os segundos precisam ser entre 0 e 59");
        }
    }

}
