package algorithm;

public class ArraySelectionSortAsc {

	public static void main(String[] args) {
		
		
		int [] a = {14, 10, -15, 42, 33, 0, 27, 42, 39, -2, 19, 44, 40, 10, -2, 33, 19};
		
		System.out.println("Unsorted array");
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1)
				System.out.print(a[i] + ", ");
			else
				System.out.print(a[i] + ".");
		}		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] >= a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}		
		System.out.println("\nSorted array");
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1)
				System.out.print(a[i] + ", ");
			else
				System.out.print(a[i] + ".");
		}
	}
}
