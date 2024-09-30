package javasessions;

public class Browser {

	public void click(String element) {
		System.out.println("click on element " + element);
	}

	public void sendKeys(String element, String value) {
		System.out.println("entering value : " + value + " into the element : " + element);
	}

	public String getTitle() {
		return "google";
	}

	// WAF: launchBrowser(String browserName)
	// browserName: chrome, firefox, safari, edge
	// return: print: success messg and return boolean(true/false)

	public boolean launchBrowser(String browserName) {

		System.out.println("browser name : " + browserName);
		boolean flag = true;

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch google chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("plz pass the right browser name : " + browserName);
			flag = false;
			break;
		}

		return flag;

	}

	public static void main(String[] args) {

		Browser obj = new Browser();
		boolean exec = obj.launchBrowser("chrome");
		System.out.println(exec);//true
		
		if (exec) {
			System.out.println("enter the URL");
		}

	}

}
