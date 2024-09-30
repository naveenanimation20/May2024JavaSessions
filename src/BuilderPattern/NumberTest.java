package BuilderPattern;

public class NumberTest {

	public static int div(int a, int b) {

		try {
			int c = a / b;
			return c;
		} catch (ArithmeticException e) {
			return -1;
		}
		
	}

	public static void main(String[] args) {

		System.out.println(div(4, 0));

		System.out.println("print the marksheet!!");

	}

}
