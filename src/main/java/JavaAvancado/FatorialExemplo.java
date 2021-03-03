package JavaAvancado;

import java.util.HashMap;
import java.util.Map;

public class FatorialExemplo {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(MAPA_FATORIAL);
    }
    public static int fatorial(int valor) {
        if(valor==1){
            return valor;
        }
        else{
            if (MAPA_FATORIAL.containsKey(valor)){
                return MAPA_FATORIAL.get(valor);
            }
            else{
                Integer resultado = valor* fatorial(valor-1);
                MAPA_FATORIAL.put(valor,resultado);
                return resultado;
            }
        }
    }
}