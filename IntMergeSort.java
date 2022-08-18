package algorithm;

class MergeSortArray {
	
	static void mergeInt(int a[], int minIndex, int midIndex, int maxIndex){
		
		int length1 = midIndex - minIndex + 1; // Find sizes of two sub-arrays to be merged
	    int length2 = maxIndex - midIndex;
	    int leftArray[] = new int[length1]; // Create 2 temporary arrays
	    int rightArray[] = new int[length2];
	    
		for (int i = 0; i < length1; i++) {//Copy data to temporary arrays
	        leftArray[i] = a[minIndex + i]; //l is index from previous iteration
		}
		for (int j = 0; j < length2; j++) {
	        rightArray[j] = a[midIndex + 1 + j]; //m+l is index from previous iteration
		}
	    // Merge the temporary arrays		
	    int i = 0, j = 0;// Initial indexes of first and second sub-arrays
	    int k = minIndex;// Initiate index of merged sub-array array	    
	    
	    for(; i < length1 && j < length2; k++) {

	        if (leftArray[i] <= rightArray[j]) 
	        	a[k] = leftArray[i++];
	        else 
	        	a[k] = rightArray[j++];
	    } 
	    
	    for(; i < length1; i++, k++) {// Copy remaining elements of L[] if any
	    	a[k] = leftArray[i];
	    }
	    for(; j < length2; j++, k++) {// Copy remaining elements of R[] if any
	    	a[k] = rightArray[j];
	    }
	}
	void mergesorted(int[] array, int minIndex, int maxIndex) {
		
		if(minIndex < maxIndex) {
			
			int midIndex = (minIndex + maxIndex) / 2;			
			mergesorted(array, minIndex, midIndex);
			mergesorted(array, midIndex + 1, maxIndex);			
			mergeInt(array, minIndex, midIndex, maxIndex);			
		}
		else {
			return;
		}
	}
	void arrayPrint(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(i<a.length - 1) {
				System.out.print(a[i]+", ");
			}
			else {
				System.out.print(a[i]+".");
			}
		}		
	}
}


public class IntMergeSort {

	public static void main(String[] args) {
		
		MergeSortArray ms = new MergeSortArray();
		
		int[] ai = {31, 15, 42, 5, 55, 11, 58, 9, 44, 3, 56, 18, 25, 75};
		
		System.out.println("Unsorted Array.");
		ms.arrayPrint(ai);
		ms.mergesorted(ai, 0, ai.length - 1);
		System.out.println("\nSorted Array.");
		ms.arrayPrint(ai);
	}
}
