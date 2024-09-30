package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		// cross browser logic
		String browser = "chrome";
		String version = "121";

		switch (browser.toLowerCase().trim()) {// chrome
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("plz pass the right browser : " + browser);
			break;

		case "opera":
			System.out.println("launch opera");
			break;

		}

		// 1 to 100
		int marks = 100;
		switch (marks) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;

		default:
			break;
		}

		// byte, short, int, char, String: allowed
		// long, float, double: NA
//		double b = 10.12;
//		switch (b) {
//		case 1:
//			
//			break;
//
//		default:
//			break;
//		}

		char ch = 'c';
		switch (ch) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;

		default:
			System.out.println(ch + " is a consonant ");
			break;
		}
		
		
		//use cases of switch case:
		//1. cross browser logic
		//2. cross OS logic
		//3. month
		//4. cross users/RBAC - user permissions
		//5. run test cases in diff env: dev,qa,uat,stage,prod
		//6. time zones
		//7. Uber: cases: sedan, mini, suv, prime
		//8. HR: user roles
		//9. localization: En, Fr, Ar, 
		//10. category: Electronics, Fashion, MakeUp, 
		
		

	}

}
