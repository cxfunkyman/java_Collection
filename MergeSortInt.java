package algorithm;

class MergeInt {
	
	void mergeint(int a[], int beg, int mid, int end)    
	{    
	    int i, j, k;  
	    int n1 = mid - beg + 1;    
	    int n2 = end - mid;    
	      
	    
	        int LeftArray[] = new int[n1];  
	        int RightArray[] = new int[n2];  
	      
	     
	    for (i = 0; i < n1; i++)    
	    LeftArray[i] = a[beg + i];    
	    
	    for (j = 0; j < n2; j++)    
	    RightArray[j] = a[mid + 1 + j];    
	      
	    i = 0;  
	    j = 0;   
	    k = beg;   
	      
	    while (i < n1 && j < n2)    //***
	    {    
	        if(LeftArray[i] <= RightArray[j])    
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
	  
	void mergeSortint(int a[], int beg, int end)  
	{  
	    if (beg < end)   
	    {  
	        int mid = (beg + end) / 2;  
	        mergeSortint(a, beg, mid);  
	        mergeSortint(a, mid + 1, end);  
	        mergeint(a, beg, mid, end);  
	    } 
	    
	}  
	  
	  
	void printArray(int a[], int n)  
	{  	     
	    for (int i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
}

public class MergeSortInt {
	
	public static void main(String[] args) {
		
		
		
		int[] ai = {31, 11, 42, 5, 55, 11, 58, 9, 44, 3, 56, 18, 25, 75};
		String[] as = {"pp", "dd", "ss", "ww", "mm", "dd", "aa", "zz", "tt", "kk", "ww", "ff"};
		
		int n = ai.length;  
	    MergeInt m1 = new MergeInt();  
	    System.out.println("\nBefore sorting array elements are.");  
	    m1.printArray(ai, n);  
	    m1.mergeSortint(ai, 0, n - 1);  
	    System.out.println("\nAfter sorting array elements are.");  
	    m1.printArray(ai, n);  
	    System.out.println("");  		
	}
}
