package javasessions;

public class TestingStack {

	public void m1() {
		int d = 12;
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		int g = 90;
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		int k = 5;
		System.out.println("m3 method");
		// m1();
	}

	public static void main(String[] args) {

		int p = 10;

		TestingStack obj = new TestingStack();
		obj.m1();

	}

}
