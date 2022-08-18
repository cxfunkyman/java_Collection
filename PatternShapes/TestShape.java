
public class TestShape {

	public static void main(String[] args) {

		System.out.println("**  **  **");

		for(int i = 1; i < 4; i++) {
			for(int j = 0; j < (i * 2) - 1; j++) {
				System.out.print(" ");
			}

			System.out.print("**");

			for(int j = 0; j <= i + 2; j++) {
				System.out.print(" ");
			}

			System.out.print("**");

			for(int j = 0; j <= i + 4; j++) {
				System.out.print(" ");
			}

			System.out.print("**");

			System.out.println();
		}

		for(int i = 4; i > 1; i--) {
			for(int j = 0; j < (i * 2) - 1; j++) {
				System.out.print(" ");
			}

			System.out.print("**");

			for(int j = 0; j <= i + 2; j++) {
				System.out.print(" ");
			}

			System.out.print("**");

			for(int j = 0; j <= i + 4; j++) {
				System.out.print(" ");
			}

			System.out.print("**");

			System.out.println();
		}

		System.out.println("**  **  **");

	}

}





