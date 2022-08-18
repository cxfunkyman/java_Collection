package sets1;

import java.util.*;
class Sets_Example_2 {
    public static void main(String args[]) {
        insertionOrder();
        insertionTime();
        deletion();
    }
    private static void insertionOrder() {
        LinkedHashSet<String> linkSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        HashSet<String> hashSet = new HashSet<String>();

// Add objects
        for(String str:Arrays.asList("boris", "alfred","paul","catherine", "alfred","zak","david")) {
            linkSet.add(str);
            treeSet.add(str);
            hashSet.add(str);
        }
        System.out.println("Insertion Order of objects in LinkedHashSet :"+ linkSet);
        System.out.println("Insertion Order of objects in TreeSet :"+ treeSet);
        System.out.println("Insertion Order of objects in HashSet :"+ hashSet);
     }


// Function to calculate insertion time of 1000 objects
     private static void insertionTime() {
        HashSet<Integer> numbersHS = new HashSet<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) numbersHS.add(i);
        long endTime = System.nanoTime();
        System.out.println("Total time to insert 1000 elements in HashSet in nanoseconds: "+(endTime-startTime));

        LinkedHashSet<Integer> numbersLLS = new LinkedHashSet<>();

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) numbersLLS.add(i);
        endTime = System.nanoTime();
        System.out.println("Total time to insert 1000 elements in LinkedHashSet nanoseconds: "+(endTime - startTime));

        TreeSet<Integer> numbersTS = new TreeSet<>();

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) numbersTS.add(i);
        endTime = System.nanoTime();
        System.out.println("Total time to insert 1000 elements in TreeSet in nanoseconds: "+(endTime - startTime));
    }

    // Function to calculate deletion time of 1000 objects
    private static void deletion() {
        HashSet<Integer> deletionHS = new HashSet<>();
        for (int i = 0; i < 1000; i++) deletionHS.add(i);
        long startingTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) deletionHS.remove(i);
        long endedTime = System.nanoTime();
        System.out.println("Total time to Deletion 1000 elements in HashSet in nanoseconds: "+Math.abs(startingTime - endedTime));

        LinkedHashSet<Integer> deletionLLS = new LinkedHashSet<>();
        for (int i = 0; i < 1000; i++) deletionLLS.add(i);
        startingTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) deletionLLS.remove(i);
        endedTime = System.nanoTime();
        System.out.println("Total time to Deletion 1000 elements in LinkedHashSet in nanoseconds: "+Math.abs(startingTime - endedTime));
 
        TreeSet<Integer> deletionTS = new TreeSet<>();
        for (int i = 0; i < 1000; i++) deletionTS.add(i); 
        startingTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) deletionTS.remove(i); 
        endedTime = System.nanoTime();
        System.out.println("Total time to Deletion 1000 elements in TreeSet in nanoseconds: "+Math.abs(startingTime - endedTime));
    }
}