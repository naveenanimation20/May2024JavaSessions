package javasessions;

public class TestMethod {

	public void getMail() {
		System.out.println("get mail");
	}

	public static void sendMail() {
		System.out.println("send mail");
	}
	
	public static void sendMail(int a) {
		System.out.println("send mail");
	}
	
	public static void sendMail(int a , int b) {
		System.out.println("send mail");
	}
	
	public void sendMail(String a) {
		System.out.println("send mail");
	}
	
	
	
	public static void main(String a[]) {
		
		System.out.println(a.length);
		
		
		//how to call static methods:
		//1. using the class name:
		TestMethod.sendMail();
		//2. within the same class, use it directly:
		sendMail();
		

		//how to call non static methods: we need to create the object:
		
		
		TestMethod obj = new TestMethod();
		obj.getMail();
		
		obj.sendMail();//warning -- not recommended
		
		
		
	}

}
