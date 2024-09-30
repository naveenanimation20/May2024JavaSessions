package EncapsulationConcept;

public class LoginPage {

	private String userName;
	private String password;

	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin() {
		System.out.println("enter username: " + getUserName());
		System.out.println("enter password: " + getPassword());
		System.out.println("click on login button");
		System.out.println("user is logged in");
	}

}
