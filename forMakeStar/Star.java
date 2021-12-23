package forMakeStar;

public class Star {

	public static void main(String[] args) {

		// Q1
		System.out.println("Q1)");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}

		// Q2
		System.out.println("\nQ2)");
		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}

		// Q3
		System.out.println("\nQ3)");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Q4
		System.out.println("\nQ4)");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// Q5
		System.out.println("\nQ5)");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// Q6
		System.out.println("\nQ6)");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + (i - 1));
			}
			System.out.println();
		}

		// Q7
		System.out.println("\nQ7)");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}

		// Q8
		System.out.println("\nQ8)");
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q9
		System.out.println("\nQ9)");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q10
		System.out.println("\nQ10)");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i ; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q11
		System.out.println("\nQ11)");
		for(int i = 1; i < 6; i++) {
			for(int j = 5; j > i ; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q12
		System.out.println("\nQ12)");
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q13
		System.out.println("\nQ13)");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q14
		System.out.println("\nQ14)");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i ; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = -1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q15
		System.out.println("\nQ15)");
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q16
		System.out.println("\nQ16)");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q17
		System.out.println("\nQ17)");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 1; j < i; j+=2) {
				System.out.print(" ");
			}
			for(int j = 10; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q18
		System.out.println("\nQ18)");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 10; i+=2) {
			for(int j = 0; j < i; j+=2) {
				System.out.print(" ");
			}
			for(int j = 8; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q19
		System.out.println("\nQ19)");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 10; j > i; j-=2) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 10; j > i; j-=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 9; i+=2) {
			for(int j = -2; j < i; j+=2) {
				System.out.print("*");
			}
			for(int j = 8; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = -2; j < i; j+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q20
		System.out.println("\nQ20)");
		for(int i = 1; i < 10; i+=2) {
			for(int j = -1; j < i; j+=2) {
				System.out.print("*");
			}
			for(int j = 10; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = -1; j < i; j+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 9; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print("*");
			}
			for(int j = -2; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 9; j > i; j-=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q21
		System.out.println("\nQ21)");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 1; j < i; j+=2) {
				System.out.print(" ");
			}
			for(int j = 10; j > i; j--) {
				System.out.print("*");
			}
			for(int j = 1; j < i; j+=2) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = 1; i < 9; i+=2) {
			for(int j = 7; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j = -2; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
