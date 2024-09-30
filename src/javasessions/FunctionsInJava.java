package javasessions;

public class FunctionsInJava {
	
	//function/method in java
	
	//no input --> no return
	//no input --> return
	//input ---> no return
	//input  -----> return
	
	
	//functions are independent to each other
	//functions are parallel to each other
	//can no create a function inside another function
	//but I can call a function from another function
	
	//class data members: 
		//1. class variables: static and non static
		//2. class methods/function: static and non static
	
	
	//1. no input and no return:
	//void -- no return, function does not return anything (no return keyword)
	public void test() {//0 param
		System.out.println("test method");
		return;
	}
	
	public void calc() {//0 param
		System.out.println("calc method");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);//30
	}
	
	
	//2. no input but some return:
	//return type: int
	public int getNumber() {//0 param
		System.out.println("get number");
		int fee = 100;
		int tax = 20;
		int totalFee = fee + tax;
		return totalFee;
		
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		return "Naveen";
	}
	
	public boolean isUserActive() {
		System.out.println("checking user status");
		return true;
	}
	
	
	//3. some input and no return:
	public void add(int a, int b) {//2 params
		System.out.println("adding two numbers");
		int sum = a+b;//30
		System.out.println(sum);//30
	}
	
	//4. some input and then return:
	public int addition(int a, int b) {
		System.out.println("adding two int numbers");
		int s = a+b;
		return s;
	}
	

	public static void main(String [] args) {

		
		//create the object:
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		
		obj.calc();
		
		//System.out.println(obj.getNumber());
		
		int t = obj.getNumber();
		System.out.println(t);
		
		
		String tr = obj.getTrainerName();
		System.out.println(tr);
		
		boolean flag = obj.isUserActive();
		System.out.println(flag);
		
		if(flag) {
			System.out.println("login to app");
		}
		
		//
		obj.add(10, 20);
		
		//
		int p = obj.addition(10, 20);
		System.out.println(p);
		
		int p1 = obj.addition(30, 40);
		System.out.println(p1);
		
	}
	
	
	

}
