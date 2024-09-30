package WebDriverArch;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("launch chrome browser...");
	}

	@Override
	public void get(String url) {
		System.out.println("entering url : " + url);
	}

	@Override
	public String getTitle() {
		return "Google";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element : " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering value: " + value + " into field: " + element);
	}

	@Override
	public void close() {
		System.out.println("closing browser");
	}

}
