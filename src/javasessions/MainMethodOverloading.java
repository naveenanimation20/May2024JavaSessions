package javasessions;

public class MainMethodOverloading {

	// JVM -- PSVM(String [])
	public static void main(String test[]) {

		System.out.println("hello");

		MainMethodOverloading.main(10);
		
		
	}

//	public static void main(String arg1[], String arg2[]) {
//		System.out.println("Naveen");
//	}

	public static void main(int a) {

		System.out.println("hii " + a);

		MainMethodOverloading.main(a, 30);
	}

	public static void main(int a, int b) {

		System.out.println("bye " + (a + b));
	}

	
		

	

}
