package exemplos;

import java.util.HashMap;

//  Hash

public class Exemplo03 {
   public static void main(String[] args) {
       HashMap<Integer, String> mapa = new HashMap<>(); // HashMap precisa de 2 coisas, chave + o que vai ser guardado na chave

       mapa.put(1, "um");
       mapa.put(2, "dois");
       mapa.put(3, "três");
       mapa.put(4, "quatro");
       
       
       System.out.println(" 3 = " + mapa.get(3));

   }
}
