package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<EstudanteStream> streamExemplo = new ArrayList<>();
        streamExemplo.add(new EstudanteStream("João",31));
        streamExemplo.add(new EstudanteStream("Maria",32));
        streamExemplo.add(new EstudanteStream("Carlos",26));
        streamExemplo.add(new EstudanteStream("Daniel",16));
        streamExemplo.add(new EstudanteStream("Henrique",15));
        streamExemplo.add(new EstudanteStream("Amanda",34));
        streamExemplo.add(new EstudanteStream("José",17));
        streamExemplo.add(new EstudanteStream("Gabriela",12));
        streamExemplo.add(new EstudanteStream("Eduardo",21));
        streamExemplo.add(new EstudanteStream("Ana",34));
        System.out.println(streamExemplo);
        streamExemplo.stream().forEach(p-> System.out.println("Lista de Nomes e Idades: "+p.toString()));
        System.out.println("Número de estudantes: "+streamExemplo.stream().count());
        System.out.println("Estudantes maiores de 18 anos: "+streamExemplo.stream().filter(estudante -> estudante.getIdade() >= 18).collect(Collectors.toList()));
        streamExemplo.forEach(e-> System.out.println("lista de nomes: "+e.getNome()));
        System.out.println("Alunos com a letra 'b': "+streamExemplo.stream().filter(estudante -> estudante.getNome().toLowerCase().contains("b")).collect((Collectors.toList())));
        System.out.println("Algum nome de aluno contém o caracter 'D': "+streamExemplo.stream().anyMatch((elemento) -> elemento.getNome().contains("D")));
        System.out.println("Aluno mais velho: "+streamExemplo.stream().max(Comparator.comparingInt(EstudanteStream::getIdade)));
        System.out.println("Aluno mais novo: "+streamExemplo.stream().min(Comparator.comparingInt(EstudanteStream::getIdade)));


    }
}