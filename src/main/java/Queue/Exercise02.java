package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise02 {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");

        for (String name:filaBanco){
            System.out.println("--> "+name);
        }
        System.out.println(filaBanco.peek());
        System.out.println(filaBanco);

        System.out.println(filaBanco.poll());
        System.out.println(filaBanco);

        filaBanco.add("Daniel");
        System.out.println(filaBanco);
        System.out.println(filaBanco.size()-1);
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());
        System.out.println(filaBanco.contains("Carlos"));
    }
}
