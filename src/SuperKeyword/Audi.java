package SuperKeyword;

public class Audi extends Car{
	
	public Audi() {
		super();//first statement in child class const...
		System.out.println("Audi -- default const...");
		
	}
	
	public Audi(int a) {
		super(a);
		System.out.println("Audi -- const..." + a);
	}
	
	public Audi(int a, int b) {
		super(a,b);
		System.out.println("Audi -- const..." + (a+b));
		System.out.println(super.speed);//100
		super.start();
		Car.testing();
	}
	
	
	

}
