
public class TriangleDiffNumber {

	public static void main(String[] args) {
		
		int n = 5, p = 1, q = 5;
		
		for (int i = 1; i <= n; i++, p++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++, q--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(q + " ");
			}
			System.out.println();
		}
		
	}

}
