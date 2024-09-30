package ExceptionHandling;

public class Student {

	public void m1() {
		System.out.println("m1");
		m2();
	}

	public void m2() {
		System.out.println("m2");

		try {
			m1();
		} catch (StackOverflowError e) {
			//System.out.println("some error is coming...");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Student st = new Student();

		st.m1();

		System.out.println("Bye!!");

	}
}


