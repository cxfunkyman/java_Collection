package sets1;

import java.util.*;

class Sets_Example_1 {
	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<>();//random
		hs.add(25);
		hs.add(-15);
		hs.add(70);
		hs.add(12);
		hs.add(35);
		hs.add(88);
		hs.add(-1);
		System.out.print("HashSet:       ");System.out.print(hs);System.out.println();
		
		Set<Integer> lhs = new LinkedHashSet<>();//as added
		lhs.add(25);
		lhs.add(-15);
		lhs.add(70);
		lhs.add(12);
		lhs.add(35);
		lhs.add(88);
		lhs.add(-1);
		System.out.print("LinkedHashSet: ");System.out.println(lhs);
		
		Set<Integer> ts = new TreeSet<>();//get sorted
		ts.add(25);
		ts.add(-15);
		ts.add(70);
		ts.add(12);
		ts.add(35);
		ts.add(88);
		ts.add(-1);
		System.out.print("TreeSet:       ");System.out.print(ts);System.out.println();
		
		// yelena
		System.out.println();
		Set<Integer> ahs = new HashSet<>();//random
		ahs.add(2);
		ahs.add(3);
		ahs.add(4);
		ahs.add(5);
		ahs.add(1);
		ahs.add(6);
		ahs.add(7);
		System.out.print("HashSet:       ");System.out.print(ahs);System.out.println();
		
		Set<Integer> alhs = new LinkedHashSet<>();//as added
		alhs.add(4);
		alhs.add(5);
		alhs.add(6);
		alhs.add(7);
		alhs.add(1);
		alhs.add(2);
		alhs.add(3);
		System.out.print("LinkedHashSet: ");System.out.println(alhs);
		
		Set<Integer> ats = new TreeSet<>();//get sorted
		ats.add(1);
		ats.add(2);
		ats.add(3);
		ats.add(4);
		ats.add(5);
		ats.add(6);
		ats.add(7);
		System.out.print("TreeSet:       ");System.out.print(ats);System.out.println();
	}
}