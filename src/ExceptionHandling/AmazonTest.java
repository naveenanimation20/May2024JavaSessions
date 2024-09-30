package ExceptionHandling;

public class AmazonTest {

	public static void main(String[] args) {

		String browser = "naveen";

		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "edge":
			System.out.println("launch edge");
			break;

		default:
			System.out.println("plz pass the right browser...." + browser);

			throw new MyException("====WRONG BROWSER PASSED====");

		}

		System.out.println("launch url");
		System.out.println("login to app");
		System.out.println("shop a product");
		System.out.println("close browser");
	}

}
