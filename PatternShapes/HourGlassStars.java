
public class HourGlassStars {

	public static void main(String[] args) {
		
		int n = 5;
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < i; j++) { //2nd triangle made of space.
				System.out.print("  ");
			}
			for (int k = i; k <= n; k++) { //3rd triangle made of stars.
				System.out.print("* ");
			}
			for (int l = i; l < n; l++) { //4th triangle made of stars.
				System.out.print("* ");
			}
						
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) { //1st triangle made of space.
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) { //1st triangle made of stars.
				System.out.print("* ");
			}
			for (int l = 1; l < i; l++) { //2nd triangle made of stars.
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
