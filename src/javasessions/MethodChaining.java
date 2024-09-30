package javasessions;

public class MethodChaining {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		MethodChaining.t1();
	}
	
	public void m4() {
		System.out.println("bye m4");
	}

	public static void t1() {
		System.out.println("t1 method");
		MethodChaining.t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		MethodChaining.t3();
	}

	public static void t3() {
		System.out.println("t3 method");
		MethodChaining obj1 = new MethodChaining();
		obj1.m4();
		
	}
	
	
	//NS -- NS : direct calling (no object required)
	//S -- S : direct/using class name
	//NS -- S: direct/using class name
	//S -- NS: Create the object and then call it
	
	
	
	

	//JVM
	public static void main(String[] args) {

		MethodChaining obj = new MethodChaining();
		obj.m1();
		
		//
		MethodChaining.t1();
		
	}

}



