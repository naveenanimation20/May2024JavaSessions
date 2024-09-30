package SuperKeyword;

public class Honda extends Car{

	public Honda() {//first it will go to Car class default const...
		this(10);//is calling same class const..
		//super(10);//not allowed
		System.out.println("Honda -- default const...");
	}
	
	public Honda(int a) {
		this(10,20);
		System.out.println("Honda -- const..." + a);//10
	}
	
	public Honda(int a, int b) {
		System.out.println("Honda -- const..." + (a+b));//30
	}
	
	
	
}
