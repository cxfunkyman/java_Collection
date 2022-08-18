package LinkedMerge;

/*
 * Implement the “Merge Sort” in descending 
 * order, for an array of strings.
 */

class MergeInt {

	void mergeint(String a[], int beg, int mid, int end) {    
		int i, j, k;  
		int n1 = mid - beg + 1;    
		int n2 = end - mid; 
		String LeftArray[] = new String[n1];  
		String RightArray[] = new String[n2];  

		for (i = 0; i < n1; i++)    
			LeftArray[i] = a[beg + i];    

		for (j = 0; j < n2; j++)    
			RightArray[j] = a[mid + 1 + j];    

		i = 0;  
		j = 0;   
		k = beg;   

		while (i < n1 && j < n2)//***
		{    
			if(LeftArray[i].compareToIgnoreCase(RightArray[j]) >= 0)    
			{    
				a[k] = LeftArray[i];    
				i++;    
			}    
			else    
			{    
				a[k] = RightArray[j];    
				j++;    
			}    
			k++;    
		}    
		while (i < n1)    
		{    
			a[k] = LeftArray[i];    
			i++;    
			k++;    
		}    

		while (j < n2)    
		{    
			a[k] = RightArray[j];    
			j++;    
			k++;    
		}    
	}  //******  
	void mergeSortint(String a[], int beg, int end) {  
		if (beg < end)  {  
			int mid = (beg + end) / 2;  
			mergeSortint(a, beg, mid);  
			mergeSortint(a, mid + 1, end);  
			mergeint(a, beg, mid, end);  
		} 
	}
	void printArray(String a[], int n)  
	{  	     
		for (int i = 0; i < n; i++)
			if(i < n - 1)
				System.out.print(a[i] + ", ");
			else
				System.out.print(a[i] + ".\n");
	}  
}
public class MergeSortString {

	public static void main(String[] args) {

		String[] as = {"vv", "pp", "hh", "ss", "yy", "mm", "dd", "ll", "gg", "aa", "zz", "tt", "kk", "ww", "ff"};

		int n = as.length;  
		MergeInt m1 = new MergeInt();  
		System.out.println("Before sorting array elements are.");  
		m1.printArray(as, n);  
		m1.mergeSortint(as, 0, n - 1);  
		System.out.println("\nAfter sorting array elements are.");  
		m1.printArray(as, n);  
		System.out.println(""); 
	}
}
