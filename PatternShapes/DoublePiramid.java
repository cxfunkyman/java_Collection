
public class DoublePiramid {

	public static void main(String[] args) {
		
		int n = 9;
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) { //1st Triangle of space.
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) { // 1st triangle of stars.
				System.out.print("* ");
			}
			for (int l = 1; l < i; l++) { // 2nd triangle of stars.
				System.out.print("* ");
			}
			for (int m = i; m < n; m++) { // 2nd triangle of space.
				System.out.print("  ");
			}
			for (int p = i; p < n; p++) { // 3rd triangle of space.
				System.out.print("  ");
			}
			for (int q = 1; q <= i; q++) { // 3rd triangle of stars.
				System.out.print("* ");
			}
			for (int r = 1; r < i; r++) { // 4th triangle of stars.
				System.out.print("* ");
			}
			
			
			
			System.out.println();
		}
	

	}

}
