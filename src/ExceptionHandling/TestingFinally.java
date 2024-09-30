package ExceptionHandling;

public class TestingFinally {

	public static int getMarks(String studentName) {

		System.out.println("getting marks for : " + studentName);

		if (studentName.equals("vibha")) {
			try {
				int i = 9 / 3;
				System.exit(1);;// shutdown the JVM
				return 30;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming..");
				return 10;
			} finally {
				System.out.println("bye!!");
				return 80;
			}
		}

		else if (studentName.equals("monika")) {
			return 90;
		}

		else if (studentName.equals("veena")) {
			return 40;
		}

		else {
			System.out.println("no student found...");

			try {
				int p = 9 / 0;
			}

			finally {
				return 5;
			}

		}
	}

	public static void main(String[] args) {

		int m1 = TestingFinally.getMarks("vibha");
		System.out.println(m1);

	}

}
