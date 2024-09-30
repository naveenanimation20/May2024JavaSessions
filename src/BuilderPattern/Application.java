package BuilderPattern;

public class Application {

	public Application login() {
		System.out.println("login to app");
		return this;
	}

	public Application login(String un, String pwd) {
		System.out.println("login to app with : " + un + " " + pwd);
		return this;
	}

	public Application search(String productName) {
		System.out.println("searching the product: " + productName);
		return this;
	}

	public Application search(String productName, int price) {
		System.out.println("searching the product: " + productName + " price: " + price);
		return this;
	}

	public Application addToCart(String productName) {
		System.out.println("adding to cart: " + productName);
		return this;
	}

	public Application doPayment(String upi) {
		System.out.println("making payment using upi : " + upi);
		return this;
	}

	public Application doPayment(String cc, int cvv) {
		System.out.println("making payment using cc : " + cc + " " + cvv);
		return this;
	}

	public Application generateOrder() {
		System.out.println("your order id is : " + 12345);
		return this;
	}

	public Application logout() {
		System.out.println("logout");
		return this;
	}

}
