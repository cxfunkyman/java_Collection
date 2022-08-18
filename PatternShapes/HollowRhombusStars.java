
public class HollowRhombusStars {

	public static void main(String[] args) {

		int n = 5;
		
// if you want to see the different triangles just delete the star and add a space for each
// triangle and leave the start just in the triangle you want to see, if want to see the 
// triangle made of space, add a star and delete one space.

		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) { //1st triangle made of space.
				System.out.print("  ");
			}
			for (int k = 1; k < i; k++) { //1st triangle made of stars.
				if (k == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int l = 1; l <= i; l++) { //2nd triangle made of stars.
				if (l == i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) { //2nd triangle made of space.
				System.out.print("  ");
			}
			for (int k = i; k < n; k++) { //3rd triangle made of stars.
				if (k == i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int l = i; l <= n; l++) { //4th triangle made of stars.
				if (l == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
						
			System.out.println();
		}

	}

}
