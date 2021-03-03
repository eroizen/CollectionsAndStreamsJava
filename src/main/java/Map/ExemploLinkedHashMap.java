package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedEstados= new LinkedHashMap<>();

        linkedEstados.put("AC", "Acre");
        linkedEstados.put("AL", "Alagoas");
        linkedEstados.put("AP", "Amapá");
        linkedEstados.put("AM", "Amazonas");
        linkedEstados.put("BA", "Bahia");
        linkedEstados.put("CE", "Ceará");
        linkedEstados.put("ES", "Espírito Santo");
        linkedEstados.put("GO", "Goiás");
        linkedEstados.put("MA", "Maranhão");
        linkedEstados.put("MT", "Mato Grosso");
        linkedEstados.put("MS", "Mato Grosso do Sul");
        linkedEstados.put("MG", "Minas Gerais");
        linkedEstados.put("PA", "Pará");
        linkedEstados.put("PB", "Paraíba");
        linkedEstados.put("PR", "Paraná");
        linkedEstados.put("PE", "Pernambuco");
        linkedEstados.put("PI", "Piauí");
        linkedEstados.put("RJ", "Rio de Janeiro");
        linkedEstados.put("RN", "Rio Grande do Norte");
        linkedEstados.put("RS", "Rio Grande do Sul");
        linkedEstados.put("RO", "Rondônia");
        linkedEstados.put("RR", "Roraima");
        linkedEstados.put("SC", "Santa Catarina");
        linkedEstados.put("SP", "São Paulo");
        linkedEstados.put("SE", "Sergipe");
        linkedEstados.put("TO", "Tocantins");

        System.out.println(linkedEstados);

        linkedEstados.remove("MG");
        System.out.println(linkedEstados);

        linkedEstados.put("DF", "Distrito Federal");


        System.out.println(linkedEstados);

        System.out.println(linkedEstados.size());

        linkedEstados.values().remove("Mato Grosso do Sul");
        System.out.println(linkedEstados);

        for(Map.Entry<String, String> entrada: linkedEstados.entrySet()){
            System.out.println(entrada.getValue()+" ("+entrada.getKey()+")");
        }

        System.out.println(linkedEstados.containsKey("SC"));
        System.out.println(linkedEstados.containsValue("Maranhão"));
    }
}

