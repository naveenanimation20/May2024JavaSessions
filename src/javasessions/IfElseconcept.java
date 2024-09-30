package javasessions;

public class IfElseconcept {

	public static void main(String[] args) {

		
		//comparing primitive data type: ==
		//compare non primitive: .equals() method
		
		
		System.out.println(10==20);
		
		
		int a = 10;
		int b = 20;
		
		if(a>b) {//false
			System.out.println("a is gr than b");
		}
		else {
			System.out.println("b is gr than a");
		}
		
		if(true) {
			System.out.println("Hii");
		}
		else {//dead code
			System.out.println("bye");
		}
		
		boolean flag = false;
		if(flag) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Bye!!");
		}
		
		boolean isHeadLess = true;
		if(isHeadLess) {
			System.out.println("run tc is headless");
		}
		else {
			System.out.println("run tc is normal mode");
		}
		
		
		if(10>5) {
			System.out.println("naveen");
		}
		
		//if--if-else--if
		//nested if/else
		
		int marks = 97;
		
		if(marks<=100) {
			if(marks>=90) {
				System.out.println("GRADE A");
					if(marks>=95) {
						System.out.println("100% scholarship");
							if(marks==100) {
								System.out.println("0% tution fee");
							}
							else {
								System.out.println("10% fee");
							}
					}
					
			}
		}
		else {
			System.out.println("INVALID MARKS");
		}
		
		
		//if-elseif-elseif-else
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		if(browser.equals("firefox")) {
			System.out.println("ff is launched");
		}
		if(browser.equals("edge")) {
			System.out.println("edge is launched");
		}
		if(browser.equals("ie")) {
			System.out.println("ie is launched");
		}
		else {
			System.out.println("plz pass the right browser : " + browser);
		}
		
//		String browser = "firefox";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("chrome is launched");
//		}
//		else if(browser.equals("firefox")) {
//			System.out.println("firefox is launched");
//		}
//		else if(browser.equals("edge")) {
//			System.out.println("edge is launched");
//		}
//		else if(browser.equals("ie")) {
//			System.out.println("ie is launched");
//		}
//		else {
//			System.out.println("plz pass the right browser : " + browser);
//		}
		
		
		int total = 100;
		if(total<=100) {
			if(total<=80) {
				System.out.println("hi");
					if(total==100) {
						
					}
			}
		}
		
		
		
	}

}
