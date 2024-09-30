package constrcutorConcept;

public class MethodChaining {

	public static void main(String[] args) {

		MethodChaining obj = new MethodChaining();
		obj.A();
		MethodChaining.D(obj);

	}

	public void A() {
		B();
		E();
		F();

		System.out.println("this is a non static method A");
	}

	// NS-NS MTHOD
	public void B() {
		A();
		System.out.println("this is a non static methond B");
	}

	public void C() {
		System.out.println("this is a non static method C");

	}

	public static void D(MethodChaining p) {

		p.A();
		p.B();
		p.C();

		System.out.println("this is a static method D");
	}

	public static void E() {
		System.out.println("this is a static methond E");
	}

	public static void F() {
		System.out.println("this is a static method F");

	}

}
