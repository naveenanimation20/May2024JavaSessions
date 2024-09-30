package javasessions;

public class CallByRef {

	String name;
	int age;

	public void m1(int a) {
		System.out.println(a);
	}

	public static void t1(CallByRef p1) {
		p1.m1(20);
		System.out.println(p1.name);// naveen
		System.out.println(p1.age);// 20

		p1.name = "Tom";
		p1.age = 40;

	}

	public static void main(String[] args) {

		CallByRef obj = new CallByRef();

		System.out.println(obj.name);// null
		System.out.println(obj.age);// 0

		obj.name = "Naveen";
		obj.age = 20;

		// obj.m1(20);// call by value/argument

		CallByRef.t1(obj);// call by reference

		System.out.println(obj.name);// tom
		System.out.println(obj.age);// 40
		
		System.out.println();

	}

}
