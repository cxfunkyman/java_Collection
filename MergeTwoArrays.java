package algorithm;

class ArrCollect {
	
	void sortString(String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i].compareToIgnoreCase(a[j]) >= 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}				
		}
	}
	
	void sortInt(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}				
		}
	}
	
	void mergeIntArray(int[] ai, int[] bi, int[] mergeInt) {
		int i = 0, j = 0, k = 0;
		while(true) {
			while((j + 1) < ai.length) {
				while(k < bi.length) {
					if(i >= mergeInt.length) {
						break;
					}
					if (ai[j] <= bi[k]) {
						
						mergeInt[i] = ai[j];
						if(j < ai.length -1)
						j++;
						if (i < mergeInt.length)
							i++;						
					}
					else {
						mergeInt[i] = bi[k];
						k++;
						if (i < mergeInt.length)
							i++;
					}
				}
			}
			if(ai[ai.length - 1] <= bi[bi.length - 1])
				mergeInt[mergeInt.length - 1] = bi[bi.length - 1];
			else
				mergeInt[mergeInt.length - 1] = ai[ai.length - 1];
			break;
		}
	}
	
	void mergeStringArray(String[] as, String[] bs, String[] mergeString) {
		int i = 0, j = 0, k = 0;
		while(true) {
			while((j + 1) < as.length) {
				while(k < bs.length) {
					if(i >= mergeString.length) {
						break;
					}
					if(as[j].compareToIgnoreCase(bs[k]) <= 0) {
						
						mergeString[i] = as[j];
						if(j < as.length -1)
						j++;
						if (i < mergeString.length)
							i++;						
					}
					else {
						mergeString[i] = bs[k];
						k++;
						if (i < mergeString.length)
							i++;
					}
				}
			}
			if (as[as.length - 1].compareToIgnoreCase(bs[bs.length - 1]) <= 0)
				mergeString[mergeString.length - 1] = bs[bs.length - 1];
			else
				mergeString[mergeString.length - 1] = as[as.length - 1];
			break;
		}
	}
	
	void stringPrint(String[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1)
				System.out.print(a[i] + ", ");
			else
				System.out.print(a[i] + ".\n");
		}		
	}
	
	void intPrint(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1)
				System.out.print(a[i] + ", ");
			else
				System.out.print(a[i] + ".\n");
		}
	}
}

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int[] ai = {31, 11, 42, 5, 55, 11, 58};
		int[] bi = {25, 9, 44, 3, 56, 18, 25, 75};
		String[] as = {"pp", "dd", "ss", "ww", "mm", "dd"};
		String[] bs = {"ff", "aa", "zz", "tt", "kk", "ww", "ff"};
		ArrCollect ac = new ArrCollect();
		int[] mergeArrayInt = new int[ai.length + bi.length];
		String[] mergeArrayString = new String[as.length + bs.length];
		
		ac.sortInt(ai);
		ac.sortInt(bi);
		ac.intPrint(ai);
		ac.intPrint(bi);
		ac.mergeIntArray(ai, bi, mergeArrayInt);
		ac.intPrint(mergeArrayInt);
		ac.sortString(as);
		ac.sortString(bs);
		ac.stringPrint(as);
		ac.stringPrint(bs);
		ac.mergeStringArray(as, bs, mergeArrayString);
		ac.stringPrint(mergeArrayString);	
	}
}

