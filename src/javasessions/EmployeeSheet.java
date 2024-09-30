package javasessions;

public class EmployeeSheet {

	// method overloading: Poly(many)+morphism(form): compileTime(static)
	// within the same class if we have multiple methods:
	// 1. with the same method name
	// 2. with the different number of parameters
	// 3. with the different sequence of parameters (if number of params are the
	// same)
	// 4. return type doesn't matter here

	// will be used for same functionality (login, search, payment)

	public int test() {// 0 param
		System.out.println("test 1 method");
		return 100;
	}

	public double test(int a) {// 1 param
		System.out.println("test 2 method");
		return 12.33;
	}

	public void test(String x) {// 1 param
		System.out.println("test 3 method");
	}

	public void test(String x, String y) {// 2 param

	}

	public void test(String a, int b) {// 2 param
		System.out.println(a + b);
	}

	public int test(int a, String b) {// 2 param
		return 100;
	}

	// use cases:
	// login
	public void login() {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	// search:
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, String color) {

	}

	public void search(String name, String color, int price) {
		System.out.println("seach with: " + name + " " + color + " " + price);
	}

	// payment:
	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(int cvv, String cc) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	// uber:
	// carBooking:
	public void carBooking(String stPoint, String endPoint) {

	}

	public void carBooking(String carType, String stPoint, String endPoint) {

	}

	public void carBooking(String carType, String stPoint, String endPoint, int passengers) {

	}

	//
	public double calculateTax(int totalIncome, int bonus, int stocksProfit) {
		System.out.println("calculating tax");
		double totalTax = (totalIncome * 30) / 100 + (bonus * 5) / 100 + (stocksProfit * 2) / 100;
		return totalTax;
	}

	public double calculateTax(int totalIncome, int bonus) {
		System.out.println("calculating tax");
		double totalTax = (totalIncome * 30) / 100 + (bonus * 5) / 100;
		return totalTax;
	}

	// void with blank return
	public void click(String element) {
		System.out.println("clicking on element : " + element);
		return;
	}

//	public void getNumber(int a) {
//		System.out.println("hi int " + a);
//	}

	public void getNumber(byte a) {
		System.out.println("hi byte " + a);
	}
	
	public void getNumber(short a) {
		System.out.println("hi short " + a);
	}
	
//	public void getNumber(long a) {
//		System.out.println("hi long " + a);
//	}

	public static void main(String[] args) {

		EmployeeSheet obj = new EmployeeSheet();
		obj.test("naveen", 70);

		obj.search("Tshirt", "Black", 1000);

		double tax = obj.calculateTax(1000, 500, 300);
		System.out.println(tax);

		obj.calculateTax(4000, 200);
		
		obj.getNumber((short)100);
		obj.getNumber((short)'a');//97


	}

}
