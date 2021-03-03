package Vector;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List<String> nomes = new java.util.Vector<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println(nomes);

        for (String nome:nomes) {
            System.out.println(nome);
        }

        nomes.set(nomes.indexOf("Carlos"),"Roberto");
        System.out.println(nomes);

        System.out.println(nomes.get(1));

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Pedro");
        System.out.println(nomes);

        System.out.println(nomes.size());

        System.out.println(nomes.contains("Juliano"));

        List<String> nomes2 = new java.util.Vector<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        nomes.addAll(nomes2);
        System.out.println(nomes2);
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println(nomes.isEmpty());

    }
}
