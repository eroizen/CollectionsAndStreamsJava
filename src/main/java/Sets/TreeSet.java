package Sets;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> treeSet = new java.util.TreeSet<>();

        treeSet.add(3);
        treeSet.add(88);
        treeSet.add(20);
        treeSet.add(44);
        treeSet.add(3);
        System.out.println(treeSet);

        for(int hashes:treeSet){
            System.out.println("-> "+hashes);
        }
        treeSet.remove(treeSet.first());
        System.out.println(treeSet);
        treeSet.add(23);
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println(treeSet.isEmpty());
    }
}