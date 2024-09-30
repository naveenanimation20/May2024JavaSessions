package Abstraction;

public abstract class Page {
	
	//we can have both abstract and non abstract methods
	//0% abstraction -- yes
	//100% abstraction -- yes
	//partial abstraction -- yes

	//can not create the object of abstract class
	
	//but can we have const... of the abstract class: this is allowed
	//and it will be called when you create the object of the child class
	
	//this is mandatory if you have any parameterize const.. in parent class
	public Page() {
		System.out.println("page const...default");
	}
	
	public Page(int a) {
		System.out.println("page const..." + a);
	}
	
	public Page(int a, int b) {
		System.out.println("page const..." + a+b);
	}
	

	//abstract methods
	public abstract void title();
	public abstract void url();

	
	//non abstract methods
	public void loading() {
		System.out.println("page loading in 20 secs");
	}
	
	public final void displayLogo() {
		System.out.println("mylogo.jpg");
	}
	

}
