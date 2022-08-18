package sets1;

import java.util.*;

/*
 * Create 2 tree sets and find out their common elements.
 */
public class CommonElements {
    public static void main(String args[]) {
        Set<Integer> d = new HashSet<Integer>();
        d.addAll(Arrays.asList(new Integer[] {3, 2, 1, 9, 6, 4, 0}));
        Set<Integer> e = new HashSet<Integer>();
        e.addAll(Arrays.asList(new Integer[] {3, 1, 9, 5, 2, 0, 7,}));

  // Union Operation
        Set<Integer> union = new HashSet<Integer>(d);
        union.addAll(e);
        System.out.println("Union :" + union);
        // Intersection Operation
        Set<Integer> intersection = new HashSet<Integer>(d);
        intersection.retainAll(e);
        System.out.println("Intersection :" + intersection);
        // Difference Operation
        Set<Integer> difference1 = new HashSet<Integer>(d);
        difference1.removeAll(e);
        System.out.println("Difference1 :" + difference1);
        //for (Integer i : difference) //other way to access set values
        //      System.out.print(i*3 + " ");
        Set<Integer> difference2 = new HashSet<Integer>(e);
        difference2.removeAll(d);
        System.out.println("Difference2 :" + difference2);
    }
}