package Sets;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new java.util.HashSet<>();

        hashSet.add(3);
        hashSet.add(88);
        hashSet.add(20);
        hashSet.add(44);
        hashSet.add(3);
        System.out.println(hashSet);

        for(int hashes:hashSet){
            System.out.println("-> "+hashes);
        }
        hashSet.add(23);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
    }
}
