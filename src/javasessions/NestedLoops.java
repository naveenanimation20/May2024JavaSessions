package javasessions;

public class NestedLoops {

	public static void main(String[] args) {

		// for -- outer
		// for --inner

		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55

		// i--> 0 to 5
		// j--> 0 to 5
		// 6*6 --> m*n
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
				break;
			}
			System.out.println();
			break;

		}

	}

}
