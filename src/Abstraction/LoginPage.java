package Abstraction;

public class LoginPage extends Page {
	

	public LoginPage() {
		System.out.println("LoginPage const...default");
	}
	
	public LoginPage(int a) {
		System.out.println("LoginPage const..." + a);
	}
	
	public LoginPage(int a, int b) {
		System.out.println("LoginPage const..." + (a+b));
	}
	
	
	@Override
	public void title() {
		System.out.println("login page title");
	}

	@Override
	public void url() {
		System.out.println("login page url");

	}

	@Override
	public void loading() {
		System.out.println("Login page loading in 5 secs");
	}
	
	//individual
	public void doLogin() {
		System.out.println("login to app");
	}
	
	
	
}

