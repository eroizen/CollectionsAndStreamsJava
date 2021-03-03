package Sets;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<Integer> lHashSet = new java.util.LinkedHashSet<>();

        lHashSet.add(3);
        lHashSet.add(88);
        lHashSet.add(20);
        lHashSet.add(44);
        lHashSet.add(3);
        System.out.println(lHashSet);

        for(int hashes:lHashSet){
            System.out.println("-> "+hashes);
        }
        lHashSet.remove(lHashSet.toArray() [0]);
        System.out.println(lHashSet);
        lHashSet.add(23);
        System.out.println(lHashSet);
        System.out.println(lHashSet.size());
        System.out.println(lHashSet.isEmpty());
    }
}