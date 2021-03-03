package ComparableComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("José Carlos", 56));
        estudantes.add(new Estudante("Eduardo", 38));
        estudantes.add(new Estudante("Antônio Carlos", 25));
        estudantes.add(new Estudante("Luiz José", 86));
        estudantes.add(new Estudante("Amanda", 21));
        estudantes.add(new Estudante("Flora", 19));
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);
        estudantes.forEach((p)-> System.out.println(p.toString()));
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        estudantes.sort(new EstudanteComparatorRev());
        System.out.println(estudantes);
    }
}