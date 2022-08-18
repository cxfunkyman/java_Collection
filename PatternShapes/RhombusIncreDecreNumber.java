
public class RhombusIncreDecreNumber {

	public static void main(String[] args) {
		
		int n = 5, p = 1;
		
		for (int i = 1; i < n; i++, p++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(p + " ");
			}
			for (int l = 1; l < i; l++) {
				System.out.print(p + " ");
			}			
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++, p--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print(p + " ");
			}
			for (int l = i; l < n; l++) {
				System.out.print(p + " ");
			}			
			System.out.println();
		}


	}

}
